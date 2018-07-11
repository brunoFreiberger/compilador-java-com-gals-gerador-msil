package compiladores.commom;

public interface ParserConstants {

    int START_SYMBOL = 45;

    int FIRST_NON_TERMINAL = 45;
    int FIRST_SEMANTIC_ACTION = 100;

    int[][] PARSER_TABLE
            = {
                {-1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 2, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 3, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, 4, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, 9, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, 6, -1, -1, -1, 8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1, 16, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 19, -1, -1, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, 22, 22, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, 25, 24, 23, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 29, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 42, -1, -1, -1, 41, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, 38, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 50, 50, 50, 50, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, 50, 50, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {65, 64, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, 65, -1, 64, -1, 64, 64, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, 68, 68, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, 73, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 74, 74, 74, 74, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, 74, 74, -1, -1},
                {77, 77, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, 77, -1, 77, -1, 77, 77, -1, -1, -1, -1, -1, -1, -1, -1, 77, 77, -1, -1, 77, 75, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 78, 78, 78, 78, -1, -1, -1, -1, -1, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, -1, -1, -1, -1, 78, -1, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, 78, 78, -1, -1},
                {-1, 82, 82, 82, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 82, 82, -1, -1},
                {84, 84, -1, -1, -1, -1, -1, -1, 84, -1, -1, -1, -1, 84, -1, 84, -1, 84, 84, -1, -1, -1, -1, -1, -1, -1, -1, 84, 84, 83, -1, 84, 84, 84, -1, 83, 83, 83, 83, 83, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 85, -1, -1, -1, -1, -1, 86, 87, 88, 89, 90, -1, -1, -1, -1},
                {-1, 91, 91, 91, 91, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 91, 91, -1, -1},
                {94, 94, -1, -1, -1, -1, -1, -1, 94, -1, -1, -1, -1, 94, -1, 94, -1, 94, 94, -1, -1, -1, -1, -1, -1, -1, -1, 94, 94, 94, -1, 94, 94, 94, -1, 94, 94, 94, 94, 94, 92, 93, -1, -1},
                {-1, 95, 95, 95, 95, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 95, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 95, 95, -1, -1},
                {98, 98, -1, -1, -1, -1, -1, -1, 98, -1, -1, -1, -1, 98, -1, 98, -1, 98, 98, -1, -1, -1, -1, -1, -1, -1, -1, 98, 98, 98, -1, 98, 98, 98, -1, 98, 98, 98, 98, 98, 98, 98, 96, 97},
                {-1, 99, 100, 101, 102, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 103, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 104, 105, -1, -1},
                {107, 107, -1, -1, -1, -1, -1, -1, 107, -1, -1, -1, 106, 107, -1, 107, -1, 107, 107, -1, -1, -1, -1, -1, -1, -1, -1, 107, 107, 107, -1, 107, 107, 107, -1, 107, 107, 107, 107, 107, 107, 107, 107, 107}
            };

    int[][] PRODUCTIONS
            = {
                {115, 8, 47, 56, 63, 10, 83, 116},
                {23, 2, 27, 48, 54},
                {0},
                {46},
                {49},
                {50},
                {17},
                {12},
                {21},
                {6},
                {28, 51, 29},
                {53, 52},
                {51},
                {0},
                {2, 27, 49},
                {2, 27, 48, 54},
                {0},
                {7, 57, 30, 59, 132, 61},
                {0},
                {55},
                {2, 122, 58},
                {32, 57},
                {0},
                {5},
                {4},
                {3},
                {60},
                {22},
                {11},
                {57, 30, 59, 132, 61},
                {0},
                {24, 64},
                {0},
                {62},
                {66, 65},
                {64},
                {0},
                {57, 27, 67, 121, 123},
                {17},
                {12},
                {21},
                {6},
                {2},
                {31, 88, 126},
                {20, 28, 2, 32, 88, 29},
                {16, 28, 57, 124, 29},
                {72},
                {73},
                {18, 28, 74, 29},
                {19, 28, 74, 29, 117},
                {88, 114, 75},
                {32, 74},
                {0},
                {77},
                {78},
                {15, 128, 27, 83, 79},
                {14, 128, 27, 83, 9, 129},
                {130, 14, 27, 83, 9, 129},
                {9, 129},
                {81},
                {82},
                {25, 128, 27, 83, 9, 131},
                {26, 128, 27, 83, 9, 131},
                {85, 84},
                {83},
                {0},
                {2, 122, 86},
                {70},
                {71},
                {127, 28, 88, 29, 87},
                {68},
                {69},
                {76},
                {80},
                {90, 89},
                {33, 90, 118, 89},
                {34, 90, 119, 89},
                {0},
                {91},
                {22, 111},
                {11, 112},
                {35, 90, 113},
                {94, 92},
                {93, 109, 94, 110},
                {0},
                {30},
                {36},
                {37},
                {38},
                {39},
                {40},
                {96, 95},
                {41, 96, 101, 95},
                {42, 96, 102, 95},
                {0},
                {98, 97},
                {43, 98, 103, 97},
                {44, 98, 104, 97},
                {0},
                {2, 125, 99},
                {3, 105},
                {4, 106},
                {5, 120},
                {28, 88, 29},
                {41, 98, 107},
                {42, 98, 108},
                {13, 28, 2, 29},
                {0}
            };

    String[] PARSER_ERROR
            = {
                "",
                "esperado fim de programa",
                "esperado comando", //"esperado identificador",
                "esperado constante int", //"esperado constanteInteira",
                "esperado constante float", //"esperado constanteReal",
                "esperado constante str", //"esperado constanteChar",
                "esperado bool",
                "esperado consts",
                "esperado def",
                "esperado end",
                "esperado execute",
                "esperado false",
                "esperado float",
                "esperado get",
                "esperado ifFalse",
                "esperado ifTrue",
                "esperado input",
                "esperado int",
                "esperado print",
                "esperado println",
                "esperado set",
                "esperado str",
                "esperado true",
                "esperado types",
                "esperado var",
                "esperado whileTrue",
                "esperado whileFalse",
                "esperado :",
                "esperado (",
                "esperado )",
                "esperado =",
                "esperado :=",
                "esperado ,",
                "esperado &&",
                "esperado ||",
                "esperado !",
                "esperado !=",
                "esperado <",
                "esperado <=",
                "esperado >",
                "esperado >=",
                "esperado +",
                "esperado -",
                "esperado *",
                "esperado /",
                "esperado def", // "<formaGeral> inválido",
                "esperado types", //"<definicaoTipos> inválido",
                "esperado consts, execute, types, var", //"<definicaoTiposOpcional> inválido",
                "esperado comando", //"<ehTipo> inválido",
                "esperado int, float, str, bool", //"<simples> inválido",
                "esperado (", //"<composto> inválido",
                "esperado identificador", //"<listaCampos> inválido",
                "esperado identificador )", //"<listaCampos1> inválido",
                "esperado identificador", //"<campo> inválido",
                "esperado identificador, consts, execute, var", //"<repTipo> inválido",
                "esperado consts, execute, var ", //"<definicaoConstantes> inválido",
                "esperado consts, execute, var", //"<definicaoConstantesOpcional> inválido",
                "esperado identificador", //"<listaIdentificadores> inválido",
                "esperado :, ), =, ,", //"<listaIdentificadores1> inválido",
                "esperado constante inteira, constante real, constante char, false, true", //"<valor> inválido",
                "esperado false, true", //"<booleano> inválido",
                "esperado identificador, execute, var", //"<repConst> inválido",
                "esperado var", //"<declaracaoVariaveis> inválido",
                "esperado var, execute", //"<declaracaoVariaveisOpcional> inválido",
                "esperado identificador", //"<declaracaoVariaveisM> inválido",
                "esperado identificador, execute", //"<declaracaoVariaveisM1> inválido",
                "esperado identificador, true", //"<declaracaoVariaveisAux> inválido",
                "esperado identificador, bool, float, int, str", //"<tipo> inválido",
                "esperado :=", //"<atribuicao> inválido",
                "esperado set", //"<manipulaTiposCompostos> inválido",
                "esperado input", //"<entrada> inválido",
                "esperado print, println", //"<saida> inválido",
                "esperado print", //"<escreve> inválido",
                "esperado println", //"<escreveAbaixo> inválido",
                "esperado expressao", //"<listaExpressoes> inválido",
                "esperado ), ,", //"<listaExpressoes1> inválido",
                "esperado get, ifFalse", //"<selecao> inválido",
                "esperado ifTrue", //"<seVerdade> inválido",
                "esperado ifFalse", //"<seFalso> inválido",
                "esperado end, ifFalse", //"<seMultiplaVerificacao> inválido",
                "esperado whileTrue, whileFalse", //"<repeticao> inválido",
                "esperado whileTrue", // "<enquantoVerdade> inválido",
                "esperado whileFalse", // "<enquantoFalso> inválido",
                "esperado comando", // "<listaComandos> inválido",
                "esperado fim de programa, end, ifFalse, comando", // "<listaComandos1> inválido",
                "esperado comando", // "<comando> inválido",
                "esperado set , :=", // "<comando1> inválido",
                "esperado get, ifTrue, whileTrue, whileFalse", // "<comando2> inválido",
                "esperado expressão", // "<expressao> inválido",
                "esperado expressão", // "<expressaox> inválido",
                "esperado expressão", // "<elemento> inválido",
                "esperado expressão", // "<relacional> inválido",
                "esperado expressão", // "<relacional1> inválido",
                "esperado expressão", // "<operador_relacional> inválido",
                "esperado expressão", // "<aritmetica> inválido",
                "esperado expressão", // "<aritmeticax> inválido",
                "esperado expressão", // "<termo> inválido",
                "esperado expressão", // "<termox> inválido",
                "esperado expressão", // "<fator> inválido",
                "esperado expressão", // "<fator1> inválido"
            };
}
