# Matrix

## Island Perimeter

Perimeter = 4 × land_cells − 2 × shared_edges

Reason:
Each cell has 4 sides.
A shared side is counted twice, so subtract 2.

Implementation trick:
Check only up and left neighbors to count each shared edge once.

## Reshape Matrix

- 2D matrix to 1D matrix : res[i*col + j] = mat[i][j]
- 1D matrix to 2D matrix : res[i/col][i%col] = mat[i]

## Image Smoother

Sometimes optimizing brute force techniques also do the job

## Flood Fill

BFS(Graph, start_vertex):
    
    for each vertex v in Graph:
        visited[v] ← false
    
    queue ← empty queue
    
    visited[start_vertex] ← true
    enqueue(queue, start_vertex)

    while queue is not empty:
        v ← dequeue(queue)
        process(v) //problem specific logic

        for each neighbor u of v:
            if visited[u] = false:
                visited[u] ← true
                enqueue(queue, u)

## Transpose matrix

- Input a matrix MxN
- Create new new transpose matrix NxM
- Transpose[j][i] = Original[i][j]