package ch17_state;

/*
현재 상황에 따라 같은 일에 대해 다르게 반응을 합니다. 배가 고플 때 밥을 먹으면 배가 부릅니다. 하지만 배가 부를 때 밥을 또 먹으면 배터질 것 같아 화가 납니다. 같은 행동인 "밥을 먹는 것"에 대해 현재 상태가 "배부름"인지 "배고픔"인지에 따라 행동이 달라지는 것입니다.
 */
public class Test {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.processEvent(Action.EAT);
        context.processEvent(Action.EAT);
        context.processEvent(Action.GOTOBED);
        context.processEvent(Action.DIGEST);
        context.processEvent(Action.GOTOBED);
    }
}
