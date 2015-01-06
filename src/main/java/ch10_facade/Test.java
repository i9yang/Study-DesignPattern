package ch10_facade;

/*
여러가지 복잡한 것들을 하나로 간주해서 편하게 다루는 방법입니다.
예를 들어, 우리가 흔히 자동차라고 하는 물건은 바퀴, 엔진, 오디오, 사이드 미러 등등 으로 이루어져있지만 우리는 그냥 다 자동차라고 생각하는 게 편합니다. 차안에서 음악을 듣고 싶으면, 그냥 오디오를 켜면 됩니다. "차량에 내장된 오디오"라는 것을 굳이 명확히 하기는 귀찮죠.
 */
public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        Audio audio = new Audio();
        Light light = new Light();

        Home home = new Home(audio, light, tv);

        home.enjoyTv();
        home.enjoyMusic();
        home.goOut();
    }
}
