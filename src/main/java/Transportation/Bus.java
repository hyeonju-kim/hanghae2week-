package Transportation;
import static Transportation.Taxi.gasLeft;

public class Bus extends Transportation{
    int maxPass = 30;		// 최대 승객 수
    int currentPass = 0;	// 현재 승객 수
    int cost = 1000;		// 요금

    // 버스 번호 지정하는 메소드 busNum
    void busNum(int i) {
        if(i==1) {
            System.out.println("버스번호 : 1");
        }else {
            System.out.println("버스번호 : 2");
        }
    }
    // 버스 상태 변경하는 메소드 busStatus (운행중/ 차고지행)
    boolean busStatus(boolean change) {
        if(change == true)
            status = "운행중";
        else {
            status = "차고지행";
            currentPass = 0;
            maxPass = 30;
        }
        return change;
    }
    // 버스 현재 상태 출력하는 메소드 currentBus(상태 및 주유랑)
    void currentBus() {
        System.out.println("상태 = "+status);
        System.out.println("주유량 = "+currentGas);
    }
    @Override
    void board(int pass, String dest, int dis) {
    }
    // 주유량
    @Override
    void refuel(){
    }
    int refuel(int gas) {
        currentGas += gas;
        if(!gasLeft()) {
            status = "차고지행";
        }
        return currentGas;
    }
    boolean available() {
        //승객 탑승은 ‘최대 승객수’ 이하까지 가능
        return maxPass >= currentPass;
    }
    // 승객 탑승
    @Override
    int board(int pass) {
        if(pass >= (maxPass-currentPass))
            System.out.println("최대 승객 수 초과");
        else {
            if(available()) {
                currentPass += pass;
                System.out.println("탑승 승객 수 = "+pass+"명");
                System.out.println("잔여 승객 수 = "+(maxPass-currentPass)+"명");
                System.out.println("요금 확인 = "+(cost*pass));
            }
            if(!available()) {
                System.out.println("최대 승객 수 초과");
            }
        }
        return currentPass;
    }
}