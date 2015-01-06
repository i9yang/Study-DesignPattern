package ch09_chainOfResponsibility;

/*
오션스 일레븐과 같은 류의 영화를 보신 적이 있죠? 전문가들이 몇 명 있습니다. 그러나, 그 전문가들은 할 수 있는 일이 극히 제한되어 있죠. 예를 들어, 해커가 격투에 능하진 않습니다. 해커는 단지 해킹에만 능합니다. 그들은 각각은 할 수 있는 일들이 제한적이지만, 모여있으면 세상만사 다 해결합니다. 각각의 전문가들이 자기가 할 수 있는 일만 하면 되거든요. 만약에 그들 모두가 해결할 수 없는 문제가 발생하면... 오션스 투엘브가 되고, 오션스 써틴이 되고 하면 됩니다. 또 영입하면 되죠 멀..
Chain of Responsiblity 패턴에서는 문제 해결사들이 한줄로 쫙 서있다가 문제가 들어오면, 자기가 해결할 수 있으면 해결하고, 안 되면 다음 해결사에게 문제를 넘겨버립니다.
 */
public class Test {
    public static void main(String[] args) {
        Problem[] problems = new Problem[5];
        problems[0] = new Problem("덩치 큰 깡패");
        problems[1] = new Problem("컴퓨터 보안장치");
        problems[2] = new Problem("까칠한 여자");
        problems[3] = new Problem("날렵한 깡패");
        problems[4] = new Problem("폭탄");

        Expert fighter = new Fighter();
        Expert hacker = new Hacker();
        Expert casanova = new Casanova();

        fighter.setNext(hacker).setNext(casanova);

        for (Problem problem : problems) {
            fighter.support(problem);
        }
    }
}
