package interp;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;
import java.util.ArrayList; 

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, ARRAY;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value; 

    /** Type of the Array **/
    private Type arrayType;

    /** Array containing the data **/
    private ArrayList<Integer> array;
    
    /** Constructor for integers */
    Data(int v) { type = Type.INTEGER; value = v; }

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Constructor for void data */
    Data() { type = Type.VOID; }

    /** Constructor for arrays of Integers */
    Data(int index, int v) {
        type = Type.ARRAY;
        arrayType = Type.INTEGER;
        array = new ArrayList<Integer>();
        for (int i = 0; i < index; ++i) array.add(0);
        array.add(v);
    }

    /** Constructor for arrays of booleans */
    Data(int index, boolean v) {
        type = Type.ARRAY;
        arrayType = Type.BOOLEAN;
        array = new ArrayList<Integer>();
        for (int i = 0; i < index; ++i) array.add(0);
        array.add(v ? 1: 0);
    }
    
    /** Copy constructor */
    Data(Data d) { 
        type = d.type; 
        value = d.value; 
        if (d.array == null) array = null;
        else array = new ArrayList<Integer>(d.array);
        arrayType = d.arrayType;
    }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Returns if the array is a boolean or integer array **/
    public Type getArrayType(){ return arrayType; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }
    
    /** Indicates whether the data is an array */
    public boolean isArray() { return type == Type.ARRAY; }

    /** Indicates whether the data is a boolean array */
    public boolean isBooleanArray() { return arrayType == Type.BOOLEAN; }

    /** Indicates whether the data is a boolean array */
    public boolean isIntegerArray() { return arrayType == Type.INTEGER; }

    /** Returns the size of the array contained **/
    public int getArraySize(){ return array.size(); }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value == 1;
    }

    /**
     * Gets the boolean value of a boolean Array. The method asserts that
     * the array is a boolean array.
     */
    public boolean getBooleanArrayValue(int index) {
        assert type == Type.ARRAY;
        assert arrayType == Type.BOOLEAN;
        int v = array.get(index);
        return v == 1;
    }

    /**
     * Gets the integer value of an integer Array. The method asserts that
     * the array is an integer array.
     */
    public int getIntegerArrayValue(int index) {
        assert type == Type.ARRAY;
        assert arrayType == Type.INTEGER;
        int v = array.get(index);
        return v;
    }

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Defines an integer value for the data */
    public void setValue(int v) { type = Type.INTEGER; value = v; }

    /** Adds nulls elements to the array to ensure the array has
        capacity to hold the element marked by the index x **/
    private void ensureArrayCapacity(int x) {
        if (x >= array.size()) {
            for (int i = array.size(); i <= x; ++i)
                array.add(0);
        }
    }

    /** Defines an integer value for the data array */
    public void setValue(int index, int v) { 
        assert type == Type.ARRAY;
        assert arrayType == Type.INTEGER;
        ensureArrayCapacity(index);
        array.set(index,v);
    }
    
    /** Defines a boolean value for the data array */
    public void setValue(int index, boolean b) { 
        assert type == Type.ARRAY;
        assert arrayType == Type.BOOLEAN;
        ensureArrayCapacity(index);
        array.set(index,b? 1:0);
    }

    /** Copies the value from another data */
    public void setData(Data d) { 
        type = d.type; 
        value = d.value; 
        arrayType = d.arrayType;
        if (d.array == null) array = null;
        else array = new ArrayList<Integer>(d.array);
    }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        else if (type == Type.ARRAY) {
            String s = "[";
            boolean first = true;
            for (int x:array) {
                if (first) first = false;
                else s+=',';
                if (arrayType == Type.INTEGER)
                    s += Integer.toString(x);
                else s += x > 0 ? "true" : "false";
            }
            s += "]\n";
            return s;
        }
        else return Integer.toString(value);
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
     
    public void evaluateArithmetic (int op, Data d) {
        assert type == Type.INTEGER && d.type == Type.INTEGER;
        switch (op) {
            case ATNLexer.PLUS: value += d.value; break;
            case ATNLexer.MINUS: value -= d.value; break;
            case ATNLexer.MUL: value *= d.value; break;
            case ATNLexer.DIV: checkDivZero(d); value /= d.value; break;
            case ATNLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        switch (op) {
            case ATNLexer.EQUAL: return new Data(value == d.value);
            case ATNLexer.NOT_EQUAL: return new Data(value != d.value);
            case ATNLexer.LT: return new Data(value < d.value);
            case ATNLexer.LE: return new Data(value <= d.value);
            case ATNLexer.GT: return new Data(value > d.value);
            case ATNLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }
}
