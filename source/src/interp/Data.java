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
    public enum Type {VOID, BOOLEAN, INTEGER, ARRAY, STRING;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private String value;   

    /** Type of the Array **/
    private Type arrayType;

    /** Array containing the data **/
    private ArrayList<String> array;
    
    /** Constructor for integers */
    Data(int v) { 
        type = Type.INTEGER; 
        arrayType = Type.VOID;
        value = String.valueOf(v); 
    }

    /** Constructor for Booleans */
    Data(boolean b) { 
        type = Type.BOOLEAN; 
        arrayType = Type.VOID;
        value = String.valueOf(b ? 1 : 0);
    }

    /** Constructor for Booleans */
    Data(String s) { 
        type = Type.STRING; 
        arrayType = Type.VOID;
        value = s; 
    }    

    /** Constructor for void data */
    Data() { type = Type.VOID; arrayType = Type.VOID;}

    /** Constructor for arrays of Integers */
    Data(int index, int v) {
        type = Type.ARRAY;
        arrayType = Type.INTEGER;
        array = new ArrayList<String>();
        for (int i = 0; i < index; ++i) array.add("0");
        array.add(String.valueOf(v));
    }

    /** Constructor for arrays of booleans */
    Data(int index, boolean v) {
        type = Type.ARRAY;
        arrayType = Type.BOOLEAN;
        array = new ArrayList<String>();
        for (int i = 0; i < index; ++i) array.add("0");
        array.add(String.valueOf(v ? 1 : 0));
    }

    /** Constructor for arrays of strings */
    Data(int index, String v) {
        type = Type.ARRAY;
        arrayType = Type.STRING;
        array = new ArrayList<String>();
        for (int i = 0; i < index; ++i) array.add("");
        array.add(v);
    }
    
    /** Copy constructor */
    Data(Data d) { 
        type = d.type;
        arrayType = d.arrayType;
        value = new String(d.value); 
        if (arrayType == Type.VOID) array = null;
        else array = new ArrayList<String>(d.array);
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

    /** Indicates whether the data is a string */
    public boolean isString() { return type == Type.STRING; }

    /** Indicates whether the data is a boolean array */
    public boolean isBooleanArray() { return arrayType == Type.BOOLEAN; }

    /** Indicates whether the data is a boolean array */
    public boolean isIntegerArray() { return arrayType == Type.INTEGER; }

    /** Indicates whether the data is a boolean array */
    public boolean isStringArray() { return arrayType == Type.STRING; }

    /** Returns the size of the array contained **/
    public int getArrayLength(){ 
        if (array == null) return 0;
        return array.size(); 
    }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return Integer.parseInt(value);
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value.equals("1");
    }

    /**
     * Gets the value of a String data. The method asserts that
     * the data is a String.
     */
    public String getStringValue() {
        assert type == Type.STRING;
        return value;
    }

    /**
     * Gets the boolean value of a boolean Array. The method asserts that
     * the array is a boolean array.
     */
    public boolean getBooleanArrayValue(int index) {
        assert type == Type.ARRAY;
        assert arrayType == Type.BOOLEAN;
        return array.get(index).equals("1");
    }

    /**
     * Gets the integer value of an integer Array. The method asserts that
     * the array is an integer array.
     */
    public int getIntegerArrayValue(int index) {
        assert type == Type.ARRAY;
        assert arrayType == Type.INTEGER;
        return Integer.parseInt(array.get(index));
    }

    /**
     * Gets the String value of an String Array. The method asserts that
     * the array is an String array.
     */
    public String getStringArrayValue(int index) {
        assert type == Type.ARRAY;
        assert arrayType == Type.STRING;
        return array.get(index);
    }

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { 
        type = Type.BOOLEAN; 
        value = String.valueOf(b ? 1 : 0); 
    }

    /** Defines an integer value for the data */
    public void setValue(int v) { 
        type = Type.INTEGER; 
        value = String.valueOf(v);
    }

    /** Defines an integer value for the data */
    public void setValue(String s) { 
        type = Type.STRING;
        value = s;
    }

    /** Adds nulls elements to the array to ensure the array has
        capacity to hold the element marked by the index x **/
    private void ensureArrayCapacity(int x) {
        if (x >= array.size()) {
            for (int i = array.size(); i <= x; ++i) {
                if (arrayType == Type.STRING)
                    array.add("");
                else array.add("0");
            }
        }
    }

    /** Defines an integer value for the data array */
    public void setValue(int index, int v) { 
        assert type == Type.ARRAY;
        assert arrayType == Type.INTEGER;
        ensureArrayCapacity(index);
        array.set(index,String.valueOf(v));
    }
    
    /** Defines a boolean value for the data array */
    public void setValue(int index, boolean b) { 
        assert type == Type.ARRAY;
        assert arrayType == Type.BOOLEAN;
        ensureArrayCapacity(index);
        array.set(index,String.valueOf(b ? 1:0));
    }

    /** Defines a boolean value for the data array */
    public void setValue(int index, String s) { 
        assert type == Type.ARRAY;
        assert arrayType == Type.STRING;
        ensureArrayCapacity(index);
        array.set(index,s);
    }

    /** Copies the value from another data */
    public void setData(Data d) { 
        type = d.type; 
        value = d.value; 
        arrayType = d.arrayType;
        if (arrayType == Type.VOID) array = null;
        else array = new ArrayList<String>(d.array);
    }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value.equals("1") ? "true" : "false";
        else if (type == Type.ARRAY) {
            String s = "[";
            boolean first = true;
            for (String x:array) {
                if (first) first = false;
                else s += ',';
                if (arrayType == Type.BOOLEAN)
                    s += x.equals("1") ? "true" : "false";
                else s += x;
            }
            s += "]\n";
            return s;
        }
        else return value;
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value.equals("0")) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
    public void evaluateArithmetic (int op, Data d) {
        assert (type == Type.INTEGER && d.type == Type.INTEGER)
                || (type == Type.STRING && d.type == Type.STRING && op == ATNLexer.PLUS);

        if (type == Type.INTEGER && d.type == Type.INTEGER) {
            int r = d.getIntegerValue(), temp = this.getIntegerValue();
            switch (op) {
                case ATNLexer.PLUS: temp += r; break;
                case ATNLexer.MINUS: temp -= r; break;
                case ATNLexer.MUL: temp *= r; break;
                case ATNLexer.DIV: checkDivZero(d); temp /= r; break;
                case ATNLexer.MOD: checkDivZero(d); temp %= r; break;
                default: assert false;
            }
            value = String.valueOf(temp);
        }
        else value += d.value;
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
            case ATNLexer.EQUAL: return new Data(value.equals(d.value));
            case ATNLexer.NOT_EQUAL: return new Data(!value.equals(d.value));
            case ATNLexer.LT: 
                if (type == Type.INTEGER) 
                    return new Data(this.getIntegerValue() < d.getIntegerValue());
                else if (type == Type.BOOLEAN)
                    throw new RuntimeException("Cannot compare with '<' two booleans");
                else return new Data(value.compareTo(d.value) < 0);

            case ATNLexer.LE: 
                if (type == Type.INTEGER) 
                    return new Data(this.getIntegerValue() <= d.getIntegerValue());
                else if (type == Type.BOOLEAN)
                    throw new RuntimeException("Cannot compare with '<=' two booleans");
                else return new Data(value.compareTo(d.value) <= 0);
            
            case ATNLexer.GT: 
                if (type == Type.INTEGER) 
                    return new Data(this.getIntegerValue() > d.getIntegerValue());
                else if (type == Type.BOOLEAN)
                    throw new RuntimeException("Cannot compare with '>' two booleans");
                else return new Data(value.compareTo(d.value) > 0);
            
            case ATNLexer.GE: 
                if (type == Type.INTEGER) 
                    return new Data(this.getIntegerValue() >= d.getIntegerValue());
                else if (type == Type.BOOLEAN)
                    throw new RuntimeException("Cannot compare with '>=' two booleans");
                else return new Data(value.compareTo(d.value) >= 0);

            default: assert false; 
        }
        return null;
    }
}
