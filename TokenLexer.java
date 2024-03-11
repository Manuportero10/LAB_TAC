/* The following code was generated by JFlex 1.7.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Expresiones.fle</tt>
 */
class TokenLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 38, 38,  0, 38, 38,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    38, 24,  0,  0,  0,  0, 25,  0,  3,  4, 22, 12,  2, 13,  0, 22, 
    37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 10,  1, 23, 11, 23,  0, 
     0, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 
    35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35,  0,  0,  0,  0, 36, 
     0,  7, 28,  9, 21, 20, 14, 35, 18,  8, 35, 35, 19, 34, 27, 15, 
    33, 35, 16,  5,  6, 30, 29, 17, 35, 35, 35, 31, 26, 32,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\4\6\1\1"+
    "\1\7\2\10\4\6\1\10\1\11\1\12\2\1\2\6"+
    "\1\13\1\14\2\6\1\15\1\16\3\6\1\7\1\11"+
    "\1\17\4\6\1\12\5\6\1\20\1\6\1\21\14\6"+
    "\1\22\1\6\1\23\3\6\1\24\1\25\1\6\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\47\0\47\0\47\0\47\0\116\0\165"+
    "\0\234\0\303\0\352\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad"+
    "\0\u01d4\0\u01fb\0\47\0\u0111\0\u0111\0\u0222\0\u0249\0\u0270"+
    "\0\u0297\0\47\0\47\0\u02be\0\u02e5\0\u030c\0\47\0\u0333"+
    "\0\u035a\0\u0381\0\47\0\47\0\47\0\u03a8\0\u03cf\0\u03f6"+
    "\0\u041d\0\47\0\u0444\0\u046b\0\u0492\0\u04b9\0\u04e0\0\165"+
    "\0\u0507\0\165\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1"+
    "\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db\0\165\0\u0702"+
    "\0\165\0\u0729\0\u0750\0\u0777\0\165\0\165\0\u079e\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\20"+
    "\1\21\3\10\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\10\1\30\1\31\1\10\1\32\1\33\1\34\1\35"+
    "\1\10\1\2\1\36\1\37\54\0\1\10\1\40\3\10"+
    "\4\0\10\10\5\0\4\10\2\0\5\10\6\0\5\10"+
    "\4\0\10\10\5\0\4\10\2\0\5\10\6\0\5\10"+
    "\4\0\10\10\5\0\1\41\3\10\2\0\5\10\6\0"+
    "\5\10\4\0\5\10\1\42\2\10\5\0\4\10\2\0"+
    "\5\10\14\0\1\43\46\0\1\44\47\0\1\45\47\0"+
    "\1\45\36\0\5\10\4\0\1\10\1\46\6\10\5\0"+
    "\4\10\2\0\5\10\6\0\5\10\4\0\6\10\1\47"+
    "\1\10\5\0\4\10\2\0\5\10\6\0\5\10\4\0"+
    "\4\10\1\50\3\10\5\0\4\10\2\0\5\10\6\0"+
    "\5\10\4\0\1\10\1\51\6\10\5\0\4\10\2\0"+
    "\5\10\32\0\1\52\47\0\1\52\21\0\5\10\4\0"+
    "\1\10\1\53\6\10\5\0\4\10\2\0\5\10\6\0"+
    "\5\10\4\0\1\10\1\54\6\10\5\0\4\10\2\0"+
    "\5\10\6\0\5\10\4\0\10\10\5\0\3\10\1\55"+
    "\2\0\5\10\6\0\2\10\1\56\2\10\4\0\10\10"+
    "\5\0\4\10\2\0\5\10\46\0\1\36\6\0\2\10"+
    "\1\57\2\10\4\0\10\10\5\0\4\10\2\0\5\10"+
    "\6\0\1\10\1\60\3\10\4\0\10\10\5\0\4\10"+
    "\2\0\5\10\6\0\2\10\1\61\2\10\4\0\10\10"+
    "\5\0\4\10\2\0\5\10\6\0\5\10\4\0\2\10"+
    "\1\62\5\10\5\0\4\10\2\0\5\10\6\0\1\10"+
    "\1\63\3\10\4\0\10\10\5\0\4\10\2\0\5\10"+
    "\6\0\3\10\1\64\1\10\4\0\10\10\5\0\4\10"+
    "\2\0\5\10\6\0\5\10\4\0\3\10\1\21\4\10"+
    "\5\0\4\10\2\0\5\10\6\0\5\10\4\0\1\10"+
    "\1\65\6\10\5\0\4\10\2\0\5\10\6\0\3\10"+
    "\1\66\1\10\4\0\10\10\5\0\4\10\2\0\5\10"+
    "\6\0\5\10\4\0\10\10\5\0\1\10\1\67\2\10"+
    "\2\0\5\10\6\0\3\10\1\70\1\10\4\0\10\10"+
    "\5\0\4\10\2\0\5\10\6\0\1\10\1\71\3\10"+
    "\4\0\10\10\5\0\4\10\2\0\5\10\6\0\1\72"+
    "\4\10\4\0\10\10\5\0\4\10\2\0\5\10\6\0"+
    "\5\10\4\0\10\10\5\0\3\10\1\73\2\0\5\10"+
    "\6\0\5\10\4\0\5\10\1\74\2\10\5\0\4\10"+
    "\2\0\5\10\6\0\5\10\4\0\5\10\1\75\2\10"+
    "\5\0\4\10\2\0\5\10\6\0\5\10\4\0\7\10"+
    "\1\60\5\0\4\10\2\0\5\10\6\0\5\10\4\0"+
    "\5\10\1\76\2\10\5\0\4\10\2\0\5\10\6\0"+
    "\5\10\4\0\10\10\5\0\1\77\3\10\2\0\5\10"+
    "\6\0\3\10\1\100\1\10\4\0\10\10\5\0\4\10"+
    "\2\0\5\10\6\0\1\101\4\10\4\0\10\10\5\0"+
    "\4\10\2\0\5\10\6\0\5\10\4\0\2\10\1\102"+
    "\5\10\5\0\4\10\2\0\5\10\6\0\5\10\4\0"+
    "\6\10\1\62\1\10\5\0\4\10\2\0\5\10\6\0"+
    "\5\10\4\0\6\10\1\103\1\10\5\0\4\10\2\0"+
    "\5\10\6\0\3\10\1\104\1\10\4\0\10\10\5\0"+
    "\4\10\2\0\5\10\6\0\4\10\1\105\4\0\10\10"+
    "\5\0\4\10\2\0\5\10\6\0\5\10\4\0\10\10"+
    "\5\0\1\106\3\10\2\0\5\10\6\0\2\10\1\107"+
    "\2\10\4\0\10\10\5\0\4\10\2\0\5\10\6\0"+
    "\4\10\1\110\4\0\10\10\5\0\4\10\2\0\5\10"+
    "\6\0\5\10\4\0\10\10\5\0\1\60\3\10\2\0"+
    "\5\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1989];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\5\11\14\1\1\11\6\1\2\11\3\1\1\11"+
    "\3\1\3\11\4\1\1\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public final int SEMICOLON;
    public final int COMMA;
    public final int OPEN_PARENTHESIS;
    public final int CLOSE_PARENTHESIS;
    public final int DEF_STATIC;
    public final int ASSIGN;
    public final int OP_ASSIGN;
    public final int LOOP;
    
	public final int ARITHMETIC;
    public final int RELATIONAL;
    public final int LOGICAL;
    public final int RETURN_TYPE;
    public final int RETURN;
    public final int OPEN_BRACKET;
    public final int CLOSE_BRACKET;

    public final int PUBLIC;
    public final int CLASS;
    public final int DEF_MAIN;
    public final int ID;
    public final int VAR_TYPE;
    public final int BOOLEAN;
    public final int INTEGER;
   
    
    public int semicolonCount;
    public int commaCount;
    public int openParenthesisCount;
    public int closeParenthesisCount;
    public int defStaticCount;
    public int assignCount;
    public int opAssignCount;
    public int loopCount;
    
    public int arithmeticCount;
    public int relationalCount;
    public int logicalCount;
    public int return_typeCount;
    public int returnCount;
    public int open_bracketCount;
    public int close_bracketCount;

    public int publicCount;
    public int classCount;
    public int mainCount;
    public int idCount;
    public int var_typeCount;
    public int booleanCount;
    public int integerCount;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TokenLexer(java.io.Reader in) {
      SEMICOLON = 1;
    COMMA = 2;
    OPEN_PARENTHESIS = 3;
    CLOSE_PARENTHESIS = 4;
    DEF_STATIC = 5;
    ASSIGN = 6;
    OP_ASSIGN = 7;
    LOOP = 8;
   	ARITHMETIC = 9;
    RELATIONAL = 10;
    LOGICAL = 11;
    RETURN_TYPE = 12;
    RETURN = 13;
    OPEN_BRACKET = 14;
    CLOSE_BRACKET = 15;
    PUBLIC = 16;
    CLASS = 17;
    DEF_MAIN = 18;
    ID = 19;
    VAR_TYPE = 20;
    BOOLEAN = 21;
    INTEGER = 22;

    semicolonCount = 0;
    commaCount = 0;
    openParenthesisCount = 0;
    closeParenthesisCount = 0;
    defStaticCount = 0;
    assignCount = 0;
    opAssignCount = 0;
    loopCount = 0;
    arithmeticCount = 0;
    relationalCount = 0;
    logicalCount = 0;
    return_typeCount = 0;
    returnCount = 0;
    open_bracketCount = 0;
    close_bracketCount = 0;
    publicCount = 0;
    classCount = 0;
    mainCount = 0;
    idCount = 0;
    var_typeCount = 0;
    booleanCount = 0;
    integerCount = 0;
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        System.out.println("-----FIN DEL PROGRAMA-----");
    System.out.println("Recuento de tokens:");
    System.out.println("SEMICOLON: " + semicolonCount);
    System.out.println("COMMA: " + commaCount);
    System.out.println("OPEN_PARENTHESIS: " + openParenthesisCount);
    System.out.println("CLOSE_PARENTHESIS: " + closeParenthesisCount);
    System.out.println("DEF_STATIC: " + defStaticCount);
    System.out.println("ASSIGN: " + assignCount);
    System.out.println("OP_ASSIGN: " + opAssignCount);
    System.out.println("ARITHMETIC: " + arithmeticCount);
    System.out.println("RELATIONAL: " + relationalCount);
    System.out.println("LOGICAL: " + logicalCount);
    System.out.println("RETURN_TYPE: " + return_typeCount);
    System.out.println("RETURN: " + returnCount);
    System.out.println("OPEN_BRACKET: " + open_bracketCount);
    System.out.println("CLOSE_BRACKET: " + close_bracketCount);
    System.out.println("PUBLIC: " + publicCount);
    System.out.println("CLASS: " + classCount);
    System.out.println("DEF_MAIN: " + mainCount);
    System.out.println("ID:" + idCount);
    System.out.println("VAR_TYPE:" + var_typeCount);
    System.out.println("BOOLEAN:" + booleanCount);
    System.out.println("INTEGER:" + integerCount);


    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 23: break;
          case 2: 
            { semicolonCount++; System.out.println("TOKEN: SEMICOLON => " + yytext());
            } 
            // fall through
          case 24: break;
          case 3: 
            { commaCount++; System.out.println("TOKEN: COMMA => " + yytext());
            } 
            // fall through
          case 25: break;
          case 4: 
            { openParenthesisCount++; System.out.println("TOKEN: OPEN_PARENTHESIS => " + yytext());
            } 
            // fall through
          case 26: break;
          case 5: 
            { closeParenthesisCount++; System.out.println("TOKEN: CLOSE_PARENTHESIS => " + yytext());
            } 
            // fall through
          case 27: break;
          case 6: 
            { idCount++; System.out.println("TOKEN: ID => " + yytext());
            } 
            // fall through
          case 28: break;
          case 7: 
            { assignCount++; System.out.println("TOKEN: ASSIGN => " + yytext());
            } 
            // fall through
          case 29: break;
          case 8: 
            { arithmeticCount++; System.out.println("TOKEN: ARITHMETIC => " + yytext());
            } 
            // fall through
          case 30: break;
          case 9: 
            { relationalCount++; System.out.println("TOKEN: RELATIONAL => " + yytext());
            } 
            // fall through
          case 31: break;
          case 10: 
            { logicalCount++; System.out.println("TOKEN: LOGICAL => " + yytext());
            } 
            // fall through
          case 32: break;
          case 11: 
            { open_bracketCount++; System.out.println("TOKEN: OPEN_BRACKET => " + yytext());
            } 
            // fall through
          case 33: break;
          case 12: 
            { close_bracketCount++; System.out.println("TOKEN: CLOSE_BRACKET => " + yytext());
            } 
            // fall through
          case 34: break;
          case 13: 
            { integerCount++; System.out.println("TOKEN: INTEGER => " + yytext());
            } 
            // fall through
          case 35: break;
          case 14: 
            { System.out.print(yytext());
            } 
            // fall through
          case 36: break;
          case 15: 
            { opAssignCount++; System.out.println("TOKEN: OP_ASSIGN => " + yytext());
            } 
            // fall through
          case 37: break;
          case 16: 
            { return_typeCount++; System.out.println("TOKEN: RETURN_TYPE => " + yytext());
            } 
            // fall through
          case 38: break;
          case 17: 
            { loopCount++; System.out.println("TOKEN: LOOP => " + yytext());
            } 
            // fall through
          case 39: break;
          case 18: 
            { mainCount++; System.out.println("TOKEN: DEF_MAIN => " + yytext());
            } 
            // fall through
          case 40: break;
          case 19: 
            { classCount++; System.out.println("TOKEN: CLASS => " + yytext());
            } 
            // fall through
          case 41: break;
          case 20: 
            { defStaticCount++; System.out.println("TOKEN: DEF_STATIC => " + yytext());
            } 
            // fall through
          case 42: break;
          case 21: 
            { returnCount++; System.out.println("TOKEN: RETURN => " + yytext());
            } 
            // fall through
          case 43: break;
          case 22: 
            { publicCount++; System.out.println("TOKEN: PUBLIC => " + yytext());
            } 
            // fall through
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java TokenLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        TokenLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new TokenLexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}