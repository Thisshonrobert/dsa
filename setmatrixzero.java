class setmatrixzero {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int col0 = 1;
        // col[m]=mat[0][..]
        // row[n]=mat[..][0]

        // set the indicators
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    if (j != 0)
                        mat[0][j] = 0;
                    else
                        col0 = 0;

                }
            }
        }
        // iterate through and change values but don't change the indicators
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] != 0) {
                    if (mat[i][0] == 0 || mat[0][j] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }
        }
        // row should be changes first because it is dependent
        if (mat[0][0] == 0) {
            for (int j = 1; j < m; j++)
                mat[0][j] = 0;
        }
        // check column
        if (col0 == 0) {
            for (int i = 0; i < n; i++)
                mat[i][0] = 0;
        }
    }
}