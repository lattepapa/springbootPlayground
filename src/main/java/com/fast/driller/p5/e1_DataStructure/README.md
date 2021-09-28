# 자료구조
## 선형 자료구조
### 배열
선형으로 자료를 관리하는 자료구조(1)
- 정해진 크기의 메모리를 먼저 할당받아 사용한다.
- 자료의 **물리적 위치**와 **논리적 위치**가 **같다**.

### 연결리스트
선형으로 자료를 관리하는 자료구조(2)
- 자료가 추가될 때마다 메모리를 할당받아 사용한다,
- 자료들은 링크로 연결되어 있다.
- 자료의 물리적 위치와 논리적 위치가 **다를 수 있다**.
- [A] → [B] → [C] → null
- 자료의 입퇴에 따라 연결이 자유롭게 끊길 수 있다.

### 스택
가장 나중에 입력된 자료가 가장 먼저 출력되는 자료구조
- 현재 `top`에 어떤 자료가 들어있는지가 중요하다.
- 추가는 `push`, 삭제는 `pop`으로 표현된다.
- **깊이우선 탐색**에 활용된다.

### 큐
가장 먼저 입력된 자료가 가장 먼저 출력되는 자료구조
- 현재 `front`와 `rear`에 어떤 자료가 들어있는지가 중요하다.
- `rear`에만 추가될 수 있으며 이는 `enqueue`라고 표현된다.
- `front`에서만 삭제될 수 있으며 이는 `dequeue`라고 표현된다.
- **너비우선 탐색**에 활용된다.

### 트리
부모 노드와 자식 노드 간의 연결로 이뤄진 자료구조

### 힙
**Priority Queue**(우선 큐)를 구현한 자료구조
- Max Heap : 부모 노드는 자식 노드보다 항상 크거나 같은 값을 갖는 경우
- Min Heap : 부모 노드는 자식 노드보다 항상 작거나 같은 값을 갖는 경우

특히, 이러한 힙의 특징을 활용하여 **힙 정렬(Heap Sort)**도 가능하다. 예를 들어, Max Heap 상황에서 가장 최상단에 있는 root를 힙에서 추출하게 되면, 그다음으로 가장 큰 수가 최상단 root 자리를 채우게 된다. 그럼 그 빈자리를 채우기 위해 전체 힙의 노드들이 Max Heap을 만족시키면서 재정렬 하게 된다.

### 이진트리
부모노드에 **자식노드가 두개 이하**인 트리

### 이진검색트리
**검색**을 위해 고안된 이진트리로, 원하는 값이 root에 없을 때
- 원하는 값보다 root가 크면 왼쪽 자식노드로 내려간다.
- 원하는 값보다 root가 작으면 오른쪽 자식노드로 내려간다.
- 이러한 로직을 통해 양쪽 자식노드 중 하나를 선택하여 내려가면서 검색한다. 이때 key의 중복은 허용하지 않는다.
- 자료검색에 걸리는 시간은 평균 **log(_2) (n)** 이라고 간주한다.

예를 들어 [23, 10, 28, 15, 7, 22, 56]의 자료가 주어진다면, 이에 대해 이진검색트리의 로직을 활용하여 트리구조로 정렬시킬 수 있다.

![bst](https://user-images.githubusercontent.com/67884699/134915986-87000ea7-f49d-462f-b84b-43c829ce6ce3.png)

이를 다시 **inorder traverse**하게 되면 오름차순 정렬이 가능해진다. 즉,
- 가장 왼쪽의 자식노드인 7부터 시작하여 부모노드 10이 존재하므로 [7, 10]
- 부모노드 10에게 오른쪽 자식노드인 15가 존재하므로 [7,10,15]
- 새로운 부모노드 15에게 왼쪽 자식노드는 존재하지 않고 이미 자신은 추출되었으므로 [7,10,15]
- 부모노드 15에게 오른쪽 자식노드인 22가 존재하므로 [7,10,15,22]
- 새로운 부모노드 22에게 더이상 자식노드는 존재하지 않고 이미 자신은 추출되었으므로 [7,10,15,22]
- 부모노드 15, 10은 모든 자식노드들과 자신이 모두 이미 추출되었으므로 [7,10,15,22]
- 새로운 부모노드 23가 존재하므로 [7,10,15,22,23]
- 부모노드 23에게 오른쪽 자식노드인 28이 존재하므로 [7,10,15,22,23,28]
- 새로운 부모노드 28에게 왼쪽 자식노드는 존재하지 않고 이미 자신은 추출되었으므로 [7,10,15,22,23,28]
- 부모노드 28에게 오른쪽 자식노드인 56이 존재하므로 [7,10,15,22,23,28,56]

이러한 방식으로 효율적인 정렬을 구현할 수 있기 때문에 **TreeSet**이나 **TreeMap** 등의 JDK 클래스가 자료구조로 채택하고 있다.

### 그래프
정점과 간선들의 유한 집합. G = (V, E)
- 정점(vertex) : 여러 특성을 가지는 객체, 즉, 노드를 의미
- 간선(edge) : 정점(객체)들의 연결관계를 나타낸 것, 즉, 링크를 의미
- 간선은 방향성이 있는 경우와 없는 경우가 있다.

그래프를 구현하는 방법은 **인접행렬**(Adjacency matrix), **인접리스트**(Adjacency list)의 두가지 방법이 있다. 또한, 그래프를 탐색하는 방법도 **BFS**(Bread First Search, 즉, 너비우선탐색), **DFS**(Depth First Search, 즉, 깊이우선탐색)의 두가지 방법이 있다.

### 해싱
자료를 검색하기 위한 자료구조이며, 특히 key에 대한 자료를 검색하기 위한 **사전**(dictionary) 개념의 자료구조.
- key는 유일하고 이에 대한 value를 쌍으로 저장한다.
- index(=h=key) : 해시함수가 key에 대한 인덱스를 반환해주므로, 이 인덱스 위치에 자료를 저장하고 또 이를 근거로 검색을 할 수 있게 되는 것이다.
- 해시함수에 의해 인덱스 연산이 산술시간밖에 소요되지 않게 된다.(O(1))
- 이러한 저장되는 메모리 구조를 특별히 **해시테이블**이라고 부른다.

이러한 방식은 **HashMap**이나 **Properties** 등의 JDK 클래스에서 자료구조로 채택하고 있다.

해시테이블은 콜리전, 즉, 해시테이블에서의 자료중복이 발생할 수 있는 리스크가 있다. 이를 회피하기 위해
- 해시테이블의 용량 상한선에 따라 해시테이블이 재구성
- 해시테이블의 각 행을 **버킷**, 각 열을 **슬롯**으로 구성(특히, 같은 버킷의 슬롯들을 synonym이라고 부름, 단, 안쓰는 슬롯이 많아질수록 메모리 오버헤드)
- 아예 오버헤드를 제로화하기 위해 각 해시테이블의 key에 대한 다수에 인덱스들을 연결리스트로 구성하는 **체이닝**

의 대안을 활용하기도 한다.