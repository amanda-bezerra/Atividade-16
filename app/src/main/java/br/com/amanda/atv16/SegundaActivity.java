package br.com.amanda.atv16;

import android.os.Bundle; // Mais uma vez, o pacote de sobrevivência.
import android.widget.TextView; // A TV que exibe texto (mas sem controle remoto).
import androidx.appcompat.app.AppCompatActivity; // Base para essa Activity também.

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // O que acontece quando a SegundaActivity é trazida à vida.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda); // Ligando esta tela ao layout correspondente.

        // Recebendo os dados que vieram da MainActivity.
        double meuDouble = getIntent().getDoubleExtra("meuDouble", 0.0); // O número quebrado desembarcou com segurança.
        String minhaString = getIntent().getStringExtra("minhaString"); // A mensagem simpática chegou intacta.
        int meuInt = getIntent().getIntExtra("meuInt", 0); // O número mágico também veio para a festa.

        // Conectando nossas TextViews, para podermos colocar os dados neles.
        TextView textViewDouble = findViewById(R.id.textViewDouble);
        TextView textViewString = findViewById(R.id.textViewString);
        TextView textViewInt = findViewById(R.id.textViewInt);

        // Exibindo os dados recebidos, como quem diz: "Olha só o que chegou!"
        textViewDouble.setText("Valor Double: " + meuDouble); // Mostrando o double.
        textViewString.setText("Valor String: " + minhaString); // Mostrando a string.
        textViewInt.setText("Valor Int: " + meuInt); // Mostrando o int.

        // Agora, nossa SegundaActivity é oficialmente informada e pronta para brilhar!
    }
}
