package bridge;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(boolean success, int numTrial) {
        System.out.println("최종 게임 결과");
        printMap();
        System.out.print("게임 성공 여부: ");
        if (success) {
            System.out.print("성공");
        }
        else {
            System.out.print("실패");
        }
        System.out.println("총 시도한 횟수" +numTrial);
    }
    public void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }
    public void printGetLength() {
        System.out.println("다리의 길이를 입력해주세요.");
    }
    public void printGetMove() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }


}
