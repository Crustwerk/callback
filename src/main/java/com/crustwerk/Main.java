package crustwerk.com.example;

import android.util.Log;

public class MainActivity {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        dataLoader.setDataLoadCallback(new DataLoadCallback() {
            @Override
            public void onDataLoaded(String userData) {
                Log.d("TAG", "Dati caricati correttamente: " + userData);
            }

            @Override
            public void onError(String errorMessage) {
                Log.d("TAG", "Si è verificato un errore: " + errorMessage);
            }
        });
        dataLoader.loadData();
    }
}