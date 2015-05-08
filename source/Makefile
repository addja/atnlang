TARGET =	ATN

# Directories
ROOT =		$(PWD)
SRCDIR = 	$(ROOT)/src
LIBDIR =	$(ROOT)/libs
CLASSDIR = 	$(ROOT)/classes
MAIN =		$(SRCDIR)/$(TARGET)
PARSER =	$(SRCDIR)/parser
INTERP =	$(SRCDIR)/interp
JAVADOC =	$(ROOT)/javadoc
BIN =		$(ROOT)/bin
TEST = 		$(ROOT)/test
TEMPDIR :=	$(shell mktemp -d)

# Executable
EXEC = 		$(BIN)/$(TARGET)
JARFILE =	$(BIN)/$(TARGET).jar
MANIFEST=	$(BIN)/$(TARGET)_Manifest.txt

# Libraries and Classpath
LIB_ANTLR =	$(LIBDIR)/antlr-3.4-complete.jar
LIB_CLI =	$(LIBDIR)/commons-cli-1.2.jar
CLASSPATH=	$(LIB_ANTLR):$(LIB_CLI)
JARPATH=	"$(LIB_ANTLR) $(LIB_CLI)"


# Distribution (tar) file
DATE= 		$(shell date +"%d%b%y")
DISTRIB=	$(TARGET)_$(DATE).tgz

# Classpath


# Flags
JFLAGS =	-classpath $(CLASSPATH) -d $(CLASSDIR)
DOCFLAGS =	-classpath $(CLASSPATH) -d $(JAVADOC) -private

# Source files
GRAMMAR = 		$(PARSER)/$(TARGET).g

MAIN_SRC =		$(MAIN)/$(TARGET).java

PARSER_SRC =	$(PARSER)/$(TARGET)Lexer.java \
				$(PARSER)/$(TARGET)Parser.java

INTERP_SRC =	$(INTERP)/Interp.java \
				$(INTERP)/Stack.java \
				$(INTERP)/Data.java \
				$(INTERP)/$(TARGET)Tree.java \
				$(INTERP)/$(TARGET)TreeAdaptor.java \
				$(INTERP)/$(TARGET)Interp.java \

ALL_SRC =		$(MAIN_SRC) $(PARSER_SRC) $(INTERP_SRC)

TESTS_SRC := 	$(wildcard $(TEST)/*.atn)

all: compile exec tests

compile:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(ALL_SRC)

docs:
	javadoc $(DOCFLAGS) $(ALL_SRC)

exec:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: ATN.ATN" > $(MANIFEST)
	echo "Class-Path: $(JARPATH)" >> $(MANIFEST)
	cd $(CLASSDIR); jar -cmf $(MANIFEST) $(JARFILE) *
	printf "#!/bin/sh\n\n" > $(EXEC)
	printf 'exec java -enableassertions -jar $(JARFILE) "$$@"' >> $(EXEC)
	chmod a+x $(EXEC)

tests: 
	@for f in $(TESTS_SRC); do \
		echo "" ; \
		echo $$f ; \
		echo "AST\tTrace\tOutput" ; \
		$(EXEC) $$f -ast $(TEMPDIR)/temp.ast -trace $(TEMPDIR)/temp.trace -parse $(TEST)/freeling.txt > $(TEMPDIR)/temp.out ; \
		diff -bB $$f.ast $(TEMPDIR)/temp.ast; \
		if [ $$? -eq 0 ] ; then \
			printf "OK\t" ; \
			else printf "FAIL\t" && exit 1; \
		fi ; \
		diff -bB $$f.trace $(TEMPDIR)/temp.trace; \
		if [ $$? -eq 0 ] ; then \
			printf "OK\t" ; \
			else printf "FAIL\t" && exit 2; \
		fi ; \
		diff -bB $$f.out $(TEMPDIR)/temp.out; \
		if [ $$? -eq 0 ] ; then \
			printf "OK\n" ; \
			else printf "FAIL\n" && exit 3; \
		fi ; \
	done

clean:
	rm -rf $(PARSER)/*.java $(PARSER)/*.tokens 
	rm -rf $(CLASSDIR)
	rm -rf $(JAVADOC)
	rm -rf $(BIN)

tar: clean
	cd ..; tar cvzf $(DISTRIB) $(TARGET); mv $(DISTRIB) $(TARGET); cd $(TARGET) 

.PHONY: all clean tar tests docs exec