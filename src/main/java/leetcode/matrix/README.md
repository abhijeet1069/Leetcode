# Matrix

## Island Perimeter

Perimeter = 4 × land_cells − 2 × shared_edges

Reason:
Each cell has 4 sides.
A shared side is counted twice, so subtract 2.

Implementation trick:
Check only up and left neighbors to count each shared edge once.

## Reshape Matrix

2D matrix to 1D matrix : res[i*col + j] = mat[i][j];
1D matrix to 2D matrix : res[i/col][i%col] = mat[i];