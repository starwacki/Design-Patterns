package adapter.exercise2;

public class Adapter implements ApiV1{

    private ApiV2 apiV2;

    public Adapter(ApiV2 apiV2) {
        this.apiV2 = apiV2;
    }

    @Override
    public void method1ApiV1() {

    }

    @Override
    public void method2ApiV1() {

    }
}
