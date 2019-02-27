public class Table {
    public static void main(String[] args) {
        char[] unicodeSymbols = 
        {
            '☻', '→', '←', '↔', '↕',
            '►', '◄', '▲', '▼', 'Ω',
            '≈', '÷', 'ø', 'Σ', 'ε', '⌡',
            '♥', '♦', '♣', '♠'
        };
        char[][] _table = new char[6][7];
        for(int r = 0; r < _table.length; r++) {
            for(int c = 0; c < _table[0].length; c++) {
                _table[r][c] = unicodeSymbols[(int)(Math.random() * unicodeSymbols.length)];
            }
        }
        for(int r = 0; r < _table.length; r++) {
            System.out.print("Row " + (r + 1) + ": ");
            for(int c = 0; c < _table[0].length; c++) {
                System.out.print(_table[r][c] + "\t");
            }
            System.out.println();
        }
    }
}