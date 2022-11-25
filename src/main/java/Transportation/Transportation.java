package Transportation;

public abstract class Transportation {
    int acceleration; // 속도 & 속도변경
    int num; // 번호
    int currentGas; // 현재 가스량
    String status; // 운행상태(운행중/ 차고지행)

    // 탑승승객, 목적지, 거리
    abstract void board(int pass, String dest, int dis);

    // 주유량
    abstract void refuel();

    abstract int refuel(int gas) ;

    abstract int board(int pass) ;

}
