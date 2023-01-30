package adapter.exercise2;

public class AppExercise2 {
    public static void main(String[] args) {
        ApiV2Impl apiV2 = new ApiV2Impl();
        Adapter adapter = new Adapter(apiV2);
        adapter.method1ApiV1();
    }
}
