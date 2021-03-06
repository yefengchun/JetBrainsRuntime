package sun.awt.event;

import java.lang.annotation.Native;
import java.util.HashMap;

public class KeyEvent {
    /** */
    @Native
    public static final int START_OF_LATIN_DIACRITIC_LETTERS = 0x0300;

    /** */
    public static final int VK_ESZETT = START_OF_LATIN_DIACRITIC_LETTERS + 0xDF;
    /** */
    public static final int VK_A_WITH_GRAVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE0;
    /** */
    public static final int VK_A_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE1;
    /** */
    public static final int VK_A_WITH_CIRCUMFLEX = START_OF_LATIN_DIACRITIC_LETTERS + 0xE2;
    /** */
    public static final int VK_A_WITH_TILDE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE3;
    /** */
    public static final int VK_A_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xE4;
    /** */
    public static final int VK_A_WITH_RING_ABOVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE5;
    /** */
    public static final int VK_AE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE6;
    /** */
    public static final int VK_C_WITH_CEDILLA = START_OF_LATIN_DIACRITIC_LETTERS + 0xE7;
    /** */
    public static final int VK_E_WITH_GRAVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE8;
    /** */
    public static final int VK_E_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xE9;
    /** */
    public static final int VK_E_WITH_CIRCUMFLEX = START_OF_LATIN_DIACRITIC_LETTERS + 0xEA;
    /** */
    public static final int VK_E_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xEB;
    /** */
    public static final int VK_I_WITH_GRAVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xEC;
    /** */
    public static final int VK_I_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xED;
    /** */
    public static final int VK_I_WITH_CIRCUMFLEX = START_OF_LATIN_DIACRITIC_LETTERS + 0xEE;
    /** */
    public static final int VK_I_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xEF;
    /** */
    public static final int VK_ETH = START_OF_LATIN_DIACRITIC_LETTERS + 0xF0;
    /** */
    public static final int VK_N_WITH_TILDE = START_OF_LATIN_DIACRITIC_LETTERS + 0xF1;
    /** */
    public static final int VK_O_WITH_GRAVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xF2;
    /** */
    public static final int VK_O_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xF3;
    /** */
    public static final int VK_O_WITH_CIRCUMFLEX = START_OF_LATIN_DIACRITIC_LETTERS + 0xF4;
    /** */
    public static final int VK_O_WITH_TILDE = START_OF_LATIN_DIACRITIC_LETTERS + 0xF5;
    /** */
    public static final int VK_O_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xF6;
    /** */
    public static final int VK_DIVISION_SIGN = START_OF_LATIN_DIACRITIC_LETTERS + 0xF7;
    /** */
    public static final int VK_O_WITH_SLASH = START_OF_LATIN_DIACRITIC_LETTERS + 0xF8;
    /** */
    public static final int VK_U_WITH_GRAVE = START_OF_LATIN_DIACRITIC_LETTERS + 0xF9;
    /** */
    public static final int VK_U_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xFA;
    /** */
    public static final int VK_U_WITH_CIRCUMFLEX = START_OF_LATIN_DIACRITIC_LETTERS + 0xFB;
    /** */
    public static final int VK_U_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xFC;
    /** */
    public static final int VK_Y_WITH_ACUTE = START_OF_LATIN_DIACRITIC_LETTERS + 0xFD;
    /** */
    public static final int VK_THORN = START_OF_LATIN_DIACRITIC_LETTERS + 0xFE;
    /** */
    public static final int VK_Y_WITH_DIAERESIS = START_OF_LATIN_DIACRITIC_LETTERS + 0xFF;

    public static final HashMap<Integer, String> asciiCodeToString = new HashMap<Integer, String>() {
        {
            put(VK_ESZETT, "\u00DF");
            put(VK_A_WITH_GRAVE, "\u00e0");
            put(VK_A_WITH_ACUTE, "\u00e1");
            put(VK_A_WITH_CIRCUMFLEX, "\u00e2");
            put(VK_A_WITH_TILDE, "\u00e3");
            put(VK_A_WITH_DIAERESIS, "\u00e4");
            put(VK_A_WITH_RING_ABOVE, "\u00e5");
            put(VK_AE, "\u00e6");
            put(VK_C_WITH_CEDILLA, "\u00e7");
            put(VK_E_WITH_GRAVE, "\u00e8");
            put(VK_E_WITH_ACUTE, "\u00e9");
            put(VK_E_WITH_CIRCUMFLEX, "\u00ea");
            put(VK_E_WITH_DIAERESIS, "\u00eb");
            put(VK_I_WITH_GRAVE, "\u00ec");
            put(VK_I_WITH_ACUTE, "\u00ed");
            put(VK_I_WITH_CIRCUMFLEX, "\u00ee");
            put(VK_I_WITH_DIAERESIS, "\u00ef");
            put(VK_ETH, "\u00f0");
            put(VK_N_WITH_TILDE, "\u00f1");
            put(VK_O_WITH_GRAVE, "\u00f2");
            put(VK_O_WITH_ACUTE, "\u00f3");
            put(VK_O_WITH_CIRCUMFLEX, "\u00f4");
            put(VK_O_WITH_TILDE, "\u00f5");
            put(VK_O_WITH_DIAERESIS, "\u00f6");
            put(VK_DIVISION_SIGN, "\u00f7");
            put(VK_O_WITH_SLASH, "\u00f8");
            put(VK_U_WITH_GRAVE, "\u00f9");
            put(VK_U_WITH_ACUTE, "\u00fa");
            put(VK_U_WITH_CIRCUMFLEX, "\u00fb");
            put(VK_U_WITH_DIAERESIS, "\u00fc");
            put(VK_Y_WITH_ACUTE, "\u00fd");
            put(VK_THORN, "\u00fe");
            put(VK_Y_WITH_DIAERESIS, "\u00ff");
        }
    };
}
