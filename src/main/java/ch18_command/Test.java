package ch18_command;

import java.util.ArrayList;
import java.util.List;

/*
명령의 객체화!! 가 Command 패턴의 핵심입니다. 언어적으로 말하면 명사화 시킨다고 보시면 됩니다.
 */
public class Test {
    public static void main(String[] args) {
        List<Command> cmds = new ArrayList<Command>();

        cmds.add(new Command() {
            @Override
            public void execute() {
                System.out.println("조낸 삽질!!");
            }
        });

        cmds.add(new Command() {
            @Override
            public void execute() {
                System.out.println("시장가서 어묵 먹기!");
            }
        });

        //여기서부터는 실행부..
        for (Command command : cmds) {
            command.execute(); //이놈은 지가 실행시키는 게 뭔지도 모른다!
        }
    }
}
