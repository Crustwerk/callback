package crustwerk.com.example;

public class DataLoader {
    private DataLoadCallback callback;

    public void setDataLoadCallback(DataLoadCallback callback) {
        this.callback = callback;
    }

    public void loadData() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                String userData = "User Name: John Doe, Age: 30, Country: Italy";
                if (callback != null) callback.onDataLoaded(userData);

            } catch (Exception e) {
                if (callback != null) callback.onError("Errore nel caricamento dei dati.");
            }
        }).start();
    }
}