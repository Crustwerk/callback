package crustwerk.com.example;

public interface DataLoadCallback {

    void onDataLoaded(String userData);

    void onError(String errorMessage);
}
