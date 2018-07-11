package compiladores.commom;

public interface ScannerConstants
{
    
    public static final String ERRO_CONSTANTE_CARACTERE_INVALIDA = "constante str inválida ou não finalizada";
    
    public static final String ERRO_CONSTANTE_REAL_INVALIDA = "constante float inválida ou não finalizada";

    public static final String ERRO_SIMBOLO_INVALIDO = "símbolo inválido";
    
    public static final String ERRO_BLOCO_COMENTARIO_INVALIDO = "comentário de bloco inválido ou não finalizado";
    
    public static final String ERRO_LINHA_COMENTARIO_INVALIDO = "comentário de linha inválido";
    
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        80,
        80,
        81,
        273,
        274,
        274,
        274,
        274,
        274,
        274,
        274,
        276,
        277,
        288,
        289,
        290,
        290,
        291,
        354,
        355,
        355,
        355,
        357,
        357,
        550,
        742,
        752,
        752,
        752,
        752,
        814,
        814,
        1007,
        1199,
        1209,
        1272,
        1464,
        1464
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {32, 1},
        {33, 2},
        {34, 3},
        {38, 4},
        {40, 5},
        {41, 6},
        {42, 7},
        {43, 8},
        {44, 9},
        {45, 10},
        {47, 11},
        {48, 12},
        {49, 13},
        {50, 13},
        {51, 13},
        {52, 13},
        {53, 13},
        {54, 13},
        {55, 13},
        {56, 13},
        {57, 13},
        {58, 14},
        {60, 15},
        {61, 16},
        {62, 17},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {124, 19},
        {61, 20},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 21},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 22},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {38, 23},
        {42, 24},
        {47, 25},
        {44, 26},
        {44, 26},
        {48, 13},
        {49, 13},
        {50, 13},
        {51, 13},
        {52, 13},
        {53, 13},
        {54, 13},
        {55, 13},
        {56, 13},
        {57, 13},
        {61, 27},
        {61, 28},
        {61, 29},
        {48, 18},
        {49, 18},
        {50, 18},
        {51, 18},
        {52, 18},
        {53, 18},
        {54, 18},
        {55, 18},
        {56, 18},
        {57, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 30},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {124, 31},
        {34, 3},
        {92, 3},
        {9, 24},
        {10, 24},
        {13, 24},
        {32, 24},
        {33, 24},
        {34, 24},
        {35, 24},
        {36, 24},
        {37, 24},
        {38, 24},
        {39, 24},
        {40, 24},
        {41, 24},
        {42, 32},
        {43, 24},
        {44, 24},
        {45, 24},
        {46, 24},
        {47, 33},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {58, 24},
        {59, 24},
        {60, 24},
        {61, 24},
        {62, 24},
        {63, 24},
        {64, 24},
        {65, 24},
        {66, 24},
        {67, 24},
        {68, 24},
        {69, 24},
        {70, 24},
        {71, 24},
        {72, 24},
        {73, 24},
        {74, 24},
        {75, 24},
        {76, 24},
        {77, 24},
        {78, 24},
        {79, 24},
        {80, 24},
        {81, 24},
        {82, 24},
        {83, 24},
        {84, 24},
        {85, 24},
        {86, 24},
        {87, 24},
        {88, 24},
        {89, 24},
        {90, 24},
        {91, 24},
        {92, 24},
        {93, 24},
        {94, 24},
        {95, 24},
        {96, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {123, 24},
        {124, 24},
        {125, 24},
        {126, 24},
        {161, 24},
        {162, 24},
        {163, 24},
        {164, 24},
        {165, 24},
        {166, 24},
        {167, 24},
        {168, 24},
        {169, 24},
        {170, 24},
        {171, 24},
        {172, 24},
        {173, 24},
        {174, 24},
        {175, 24},
        {176, 24},
        {177, 24},
        {178, 24},
        {179, 24},
        {180, 24},
        {181, 24},
        {182, 24},
        {183, 24},
        {184, 24},
        {185, 24},
        {186, 24},
        {187, 24},
        {188, 24},
        {189, 24},
        {190, 24},
        {191, 24},
        {192, 24},
        {193, 24},
        {194, 24},
        {195, 24},
        {196, 24},
        {197, 24},
        {198, 24},
        {199, 24},
        {200, 24},
        {201, 24},
        {202, 24},
        {203, 24},
        {204, 24},
        {205, 24},
        {206, 24},
        {207, 24},
        {208, 24},
        {209, 24},
        {210, 24},
        {211, 24},
        {212, 24},
        {213, 24},
        {214, 24},
        {215, 24},
        {216, 24},
        {217, 24},
        {218, 24},
        {219, 24},
        {220, 24},
        {221, 24},
        {222, 24},
        {223, 24},
        {224, 24},
        {225, 24},
        {226, 24},
        {227, 24},
        {228, 24},
        {229, 24},
        {230, 24},
        {231, 24},
        {232, 24},
        {233, 24},
        {234, 24},
        {235, 24},
        {236, 24},
        {237, 24},
        {238, 24},
        {239, 24},
        {240, 24},
        {241, 24},
        {242, 24},
        {243, 24},
        {244, 24},
        {245, 24},
        {246, 24},
        {247, 24},
        {248, 24},
        {249, 24},
        {250, 24},
        {251, 24},
        {252, 24},
        {253, 24},
        {254, 24},
        {255, 24},
        {9, 25},
        {13, 25},
        {32, 25},
        {33, 25},
        {34, 25},
        {35, 25},
        {36, 25},
        {37, 25},
        {38, 25},
        {39, 25},
        {40, 25},
        {41, 25},
        {42, 25},
        {43, 25},
        {44, 25},
        {45, 25},
        {46, 25},
        {47, 25},
        {48, 25},
        {49, 25},
        {50, 25},
        {51, 25},
        {52, 25},
        {53, 25},
        {54, 25},
        {55, 25},
        {56, 25},
        {57, 25},
        {58, 25},
        {59, 25},
        {60, 25},
        {61, 25},
        {62, 25},
        {63, 25},
        {64, 25},
        {65, 25},
        {66, 25},
        {67, 25},
        {68, 25},
        {69, 25},
        {70, 25},
        {71, 25},
        {72, 25},
        {73, 25},
        {74, 25},
        {75, 25},
        {76, 25},
        {77, 25},
        {78, 25},
        {79, 25},
        {80, 25},
        {81, 25},
        {82, 25},
        {83, 25},
        {84, 25},
        {85, 25},
        {86, 25},
        {87, 25},
        {88, 25},
        {89, 25},
        {90, 25},
        {91, 25},
        {92, 25},
        {93, 25},
        {94, 25},
        {95, 25},
        {96, 25},
        {97, 25},
        {98, 25},
        {99, 25},
        {100, 25},
        {101, 25},
        {102, 25},
        {103, 25},
        {104, 25},
        {105, 25},
        {106, 25},
        {107, 25},
        {108, 25},
        {109, 25},
        {110, 25},
        {111, 25},
        {112, 25},
        {113, 25},
        {114, 25},
        {115, 25},
        {116, 25},
        {117, 25},
        {118, 25},
        {119, 25},
        {120, 25},
        {121, 25},
        {122, 25},
        {123, 25},
        {124, 25},
        {125, 25},
        {126, 25},
        {161, 25},
        {162, 25},
        {163, 25},
        {164, 25},
        {165, 25},
        {166, 25},
        {167, 25},
        {168, 25},
        {169, 25},
        {170, 25},
        {171, 25},
        {172, 25},
        {173, 25},
        {174, 25},
        {175, 25},
        {176, 25},
        {177, 25},
        {178, 25},
        {179, 25},
        {180, 25},
        {181, 25},
        {182, 25},
        {183, 25},
        {184, 25},
        {185, 25},
        {186, 25},
        {187, 25},
        {188, 25},
        {189, 25},
        {190, 25},
        {191, 25},
        {192, 25},
        {193, 25},
        {194, 25},
        {195, 25},
        {196, 25},
        {197, 25},
        {198, 25},
        {199, 25},
        {200, 25},
        {201, 25},
        {202, 25},
        {203, 25},
        {204, 25},
        {205, 25},
        {206, 25},
        {207, 25},
        {208, 25},
        {209, 25},
        {210, 25},
        {211, 25},
        {212, 25},
        {213, 25},
        {214, 25},
        {215, 25},
        {216, 25},
        {217, 25},
        {218, 25},
        {219, 25},
        {220, 25},
        {221, 25},
        {222, 25},
        {223, 25},
        {224, 25},
        {225, 25},
        {226, 25},
        {227, 25},
        {228, 25},
        {229, 25},
        {230, 25},
        {231, 25},
        {232, 25},
        {233, 25},
        {234, 25},
        {235, 25},
        {236, 25},
        {237, 25},
        {238, 25},
        {239, 25},
        {240, 25},
        {241, 25},
        {242, 25},
        {243, 25},
        {244, 25},
        {245, 25},
        {246, 25},
        {247, 25},
        {248, 25},
        {249, 25},
        {250, 25},
        {251, 25},
        {252, 25},
        {253, 25},
        {254, 25},
        {255, 25},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 35},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {65, 35},
        {66, 35},
        {67, 35},
        {68, 35},
        {69, 35},
        {70, 35},
        {71, 35},
        {72, 35},
        {73, 35},
        {74, 35},
        {75, 35},
        {76, 35},
        {77, 35},
        {78, 35},
        {79, 35},
        {80, 35},
        {81, 35},
        {82, 35},
        {83, 35},
        {84, 35},
        {85, 35},
        {86, 35},
        {87, 35},
        {88, 35},
        {89, 35},
        {90, 35},
        {97, 35},
        {98, 35},
        {99, 35},
        {100, 35},
        {101, 35},
        {102, 35},
        {103, 35},
        {104, 35},
        {105, 35},
        {106, 35},
        {107, 35},
        {108, 35},
        {109, 35},
        {110, 35},
        {111, 35},
        {112, 35},
        {113, 35},
        {114, 35},
        {115, 35},
        {116, 35},
        {117, 35},
        {118, 35},
        {119, 35},
        {120, 35},
        {121, 35},
        {122, 35},
        {9, 24},
        {10, 24},
        {13, 24},
        {32, 24},
        {33, 24},
        {34, 24},
        {35, 24},
        {36, 24},
        {37, 24},
        {38, 24},
        {39, 24},
        {40, 24},
        {41, 24},
        {42, 36},
        {43, 24},
        {44, 24},
        {45, 24},
        {46, 24},
        {47, 37},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {58, 24},
        {59, 24},
        {60, 24},
        {61, 24},
        {62, 24},
        {63, 24},
        {64, 24},
        {65, 24},
        {66, 24},
        {67, 24},
        {68, 24},
        {69, 24},
        {70, 24},
        {71, 24},
        {72, 24},
        {73, 24},
        {74, 24},
        {75, 24},
        {76, 24},
        {77, 24},
        {78, 24},
        {79, 24},
        {80, 24},
        {81, 24},
        {82, 24},
        {83, 24},
        {84, 24},
        {85, 24},
        {86, 24},
        {87, 24},
        {88, 24},
        {89, 24},
        {90, 24},
        {91, 24},
        {92, 24},
        {93, 24},
        {94, 24},
        {95, 24},
        {96, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {123, 24},
        {124, 24},
        {125, 24},
        {126, 24},
        {161, 24},
        {162, 24},
        {163, 24},
        {164, 24},
        {165, 24},
        {166, 24},
        {167, 24},
        {168, 24},
        {169, 24},
        {170, 24},
        {171, 24},
        {172, 24},
        {173, 24},
        {174, 24},
        {175, 24},
        {176, 24},
        {177, 24},
        {178, 24},
        {179, 24},
        {180, 24},
        {181, 24},
        {182, 24},
        {183, 24},
        {184, 24},
        {185, 24},
        {186, 24},
        {187, 24},
        {188, 24},
        {189, 24},
        {190, 24},
        {191, 24},
        {192, 24},
        {193, 24},
        {194, 24},
        {195, 24},
        {196, 24},
        {197, 24},
        {198, 24},
        {199, 24},
        {200, 24},
        {201, 24},
        {202, 24},
        {203, 24},
        {204, 24},
        {205, 24},
        {206, 24},
        {207, 24},
        {208, 24},
        {209, 24},
        {210, 24},
        {211, 24},
        {212, 24},
        {213, 24},
        {214, 24},
        {215, 24},
        {216, 24},
        {217, 24},
        {218, 24},
        {219, 24},
        {220, 24},
        {221, 24},
        {222, 24},
        {223, 24},
        {224, 24},
        {225, 24},
        {226, 24},
        {227, 24},
        {228, 24},
        {229, 24},
        {230, 24},
        {231, 24},
        {232, 24},
        {233, 24},
        {234, 24},
        {235, 24},
        {236, 24},
        {237, 24},
        {238, 24},
        {239, 24},
        {240, 24},
        {241, 24},
        {242, 24},
        {243, 24},
        {244, 24},
        {245, 24},
        {246, 24},
        {247, 24},
        {248, 24},
        {249, 24},
        {250, 24},
        {251, 24},
        {252, 24},
        {253, 24},
        {254, 24},
        {255, 24},
        {9, 24},
        {10, 24},
        {13, 24},
        {32, 24},
        {33, 24},
        {34, 24},
        {35, 24},
        {36, 24},
        {37, 24},
        {38, 24},
        {39, 24},
        {40, 24},
        {41, 24},
        {43, 24},
        {44, 24},
        {45, 24},
        {46, 24},
        {47, 33},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {58, 24},
        {59, 24},
        {60, 24},
        {61, 24},
        {62, 24},
        {63, 24},
        {64, 24},
        {65, 24},
        {66, 24},
        {67, 24},
        {68, 24},
        {69, 24},
        {70, 24},
        {71, 24},
        {72, 24},
        {73, 24},
        {74, 24},
        {75, 24},
        {76, 24},
        {77, 24},
        {78, 24},
        {79, 24},
        {80, 24},
        {81, 24},
        {82, 24},
        {83, 24},
        {84, 24},
        {85, 24},
        {86, 24},
        {87, 24},
        {88, 24},
        {89, 24},
        {90, 24},
        {91, 24},
        {92, 24},
        {93, 24},
        {94, 24},
        {95, 24},
        {96, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {123, 24},
        {124, 24},
        {125, 24},
        {126, 24},
        {161, 24},
        {162, 24},
        {163, 24},
        {164, 24},
        {165, 24},
        {166, 24},
        {167, 24},
        {168, 24},
        {169, 24},
        {170, 24},
        {171, 24},
        {172, 24},
        {173, 24},
        {174, 24},
        {175, 24},
        {176, 24},
        {177, 24},
        {178, 24},
        {179, 24},
        {180, 24},
        {181, 24},
        {182, 24},
        {183, 24},
        {184, 24},
        {185, 24},
        {186, 24},
        {187, 24},
        {188, 24},
        {189, 24},
        {190, 24},
        {191, 24},
        {192, 24},
        {193, 24},
        {194, 24},
        {195, 24},
        {196, 24},
        {197, 24},
        {198, 24},
        {199, 24},
        {200, 24},
        {201, 24},
        {202, 24},
        {203, 24},
        {204, 24},
        {205, 24},
        {206, 24},
        {207, 24},
        {208, 24},
        {209, 24},
        {210, 24},
        {211, 24},
        {212, 24},
        {213, 24},
        {214, 24},
        {215, 24},
        {216, 24},
        {217, 24},
        {218, 24},
        {219, 24},
        {220, 24},
        {221, 24},
        {222, 24},
        {223, 24},
        {224, 24},
        {225, 24},
        {226, 24},
        {227, 24},
        {228, 24},
        {229, 24},
        {230, 24},
        {231, 24},
        {232, 24},
        {233, 24},
        {234, 24},
        {235, 24},
        {236, 24},
        {237, 24},
        {238, 24},
        {239, 24},
        {240, 24},
        {241, 24},
        {242, 24},
        {243, 24},
        {244, 24},
        {245, 24},
        {246, 24},
        {247, 24},
        {248, 24},
        {249, 24},
        {250, 24},
        {251, 24},
        {252, 24},
        {253, 24},
        {254, 24},
        {255, 24},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 35},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {65, 35},
        {66, 35},
        {67, 35},
        {68, 35},
        {69, 35},
        {70, 35},
        {71, 35},
        {72, 35},
        {73, 35},
        {74, 35},
        {75, 35},
        {76, 35},
        {77, 35},
        {78, 35},
        {79, 35},
        {80, 35},
        {81, 35},
        {82, 35},
        {83, 35},
        {84, 35},
        {85, 35},
        {86, 35},
        {87, 35},
        {88, 35},
        {89, 35},
        {90, 35},
        {95, 30},
        {97, 35},
        {98, 35},
        {99, 35},
        {100, 35},
        {101, 35},
        {102, 35},
        {103, 35},
        {104, 35},
        {105, 35},
        {106, 35},
        {107, 35},
        {108, 35},
        {109, 35},
        {110, 35},
        {111, 35},
        {112, 35},
        {113, 35},
        {114, 35},
        {115, 35},
        {116, 35},
        {117, 35},
        {118, 35},
        {119, 35},
        {120, 35},
        {121, 35},
        {122, 35},
        {9, 24},
        {10, 24},
        {13, 24},
        {32, 24},
        {33, 24},
        {34, 24},
        {35, 24},
        {36, 24},
        {37, 24},
        {38, 24},
        {39, 24},
        {40, 24},
        {41, 24},
        {42, 36},
        {43, 24},
        {44, 24},
        {45, 24},
        {46, 24},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {58, 24},
        {59, 24},
        {60, 24},
        {61, 24},
        {62, 24},
        {63, 24},
        {64, 24},
        {65, 24},
        {66, 24},
        {67, 24},
        {68, 24},
        {69, 24},
        {70, 24},
        {71, 24},
        {72, 24},
        {73, 24},
        {74, 24},
        {75, 24},
        {76, 24},
        {77, 24},
        {78, 24},
        {79, 24},
        {80, 24},
        {81, 24},
        {82, 24},
        {83, 24},
        {84, 24},
        {85, 24},
        {86, 24},
        {87, 24},
        {88, 24},
        {89, 24},
        {90, 24},
        {91, 24},
        {92, 24},
        {93, 24},
        {94, 24},
        {95, 24},
        {96, 24},
        {97, 24},
        {98, 24},
        {99, 24},
        {100, 24},
        {101, 24},
        {102, 24},
        {103, 24},
        {104, 24},
        {105, 24},
        {106, 24},
        {107, 24},
        {108, 24},
        {109, 24},
        {110, 24},
        {111, 24},
        {112, 24},
        {113, 24},
        {114, 24},
        {115, 24},
        {116, 24},
        {117, 24},
        {118, 24},
        {119, 24},
        {120, 24},
        {121, 24},
        {122, 24},
        {123, 24},
        {124, 24},
        {125, 24},
        {126, 24},
        {161, 24},
        {162, 24},
        {163, 24},
        {164, 24},
        {165, 24},
        {166, 24},
        {167, 24},
        {168, 24},
        {169, 24},
        {170, 24},
        {171, 24},
        {172, 24},
        {173, 24},
        {174, 24},
        {175, 24},
        {176, 24},
        {177, 24},
        {178, 24},
        {179, 24},
        {180, 24},
        {181, 24},
        {182, 24},
        {183, 24},
        {184, 24},
        {185, 24},
        {186, 24},
        {187, 24},
        {188, 24},
        {189, 24},
        {190, 24},
        {191, 24},
        {192, 24},
        {193, 24},
        {194, 24},
        {195, 24},
        {196, 24},
        {197, 24},
        {198, 24},
        {199, 24},
        {200, 24},
        {201, 24},
        {202, 24},
        {203, 24},
        {204, 24},
        {205, 24},
        {206, 24},
        {207, 24},
        {208, 24},
        {209, 24},
        {210, 24},
        {211, 24},
        {212, 24},
        {213, 24},
        {214, 24},
        {215, 24},
        {216, 24},
        {217, 24},
        {218, 24},
        {219, 24},
        {220, 24},
        {221, 24},
        {222, 24},
        {223, 24},
        {224, 24},
        {225, 24},
        {226, 24},
        {227, 24},
        {228, 24},
        {229, 24},
        {230, 24},
        {231, 24},
        {232, 24},
        {233, 24},
        {234, 24},
        {235, 24},
        {236, 24},
        {237, 24},
        {238, 24},
        {239, 24},
        {240, 24},
        {241, 24},
        {242, 24},
        {243, 24},
        {244, 24},
        {245, 24},
        {246, 24},
        {247, 24},
        {248, 24},
        {249, 24},
        {250, 24},
        {251, 24},
        {252, 24},
        {253, 24},
        {254, 24},
        {255, 24}
    };

    int[] TOKEN_STATE = {-2,  0, 35, -1, -1, 28, 29, 43, 41, 32, 42, 44,  3,  3, 27, 37, 30, 39,  2, -1, 36,  5, -1, 33, -2,  0, -1, 31, 38, 40,  2, 34, -2, -2,  4,  2, -2,  0 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21 };

    String[] SPECIAL_CASES_KEYS =
        {  "BOOL", "CONSTS", "DEF", "END", "EXECUTE", "FALSE", "FLOAT", "GET", "IFFALSE", "IFTRUE", "INPUT", "INT", "PRINT", "PRINTLN", "SET", "STR", "TRUE", "TYPES", "VAR", "WHILEFALSE", "WHILETRUE" };

    int[] SPECIAL_CASES_VALUES =
        {  6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 25 };

 String[] SCANNER_ERROR =
    {
        ERRO_SIMBOLO_INVALIDO,
        "",
        "",
        ERRO_CONSTANTE_CARACTERE_INVALIDA,
        ERRO_CONSTANTE_CARACTERE_INVALIDA,
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ERRO_CONSTANTE_CARACTERE_INVALIDA,
        "",
        "",
        ERRO_CONSTANTE_CARACTERE_INVALIDA,
        "",
        ERRO_BLOCO_COMENTARIO_INVALIDO,
        "",
        ERRO_CONSTANTE_REAL_INVALIDA,
        "",
        "",
        "",
        "",
        "",
        ERRO_BLOCO_COMENTARIO_INVALIDO,
        ERRO_BLOCO_COMENTARIO_INVALIDO,
        "",
        "",
        ERRO_BLOCO_COMENTARIO_INVALIDO,
        ""
    };

}
