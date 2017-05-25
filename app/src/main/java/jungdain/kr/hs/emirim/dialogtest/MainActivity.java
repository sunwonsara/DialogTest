package jungdain.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        final String[] itemArr={"포메","요크","말티즈","푸들"};
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.drawable.hart); //어플리케이션 홈화면에 나오는 아이콘
//      dialog.setMessage("여기는 메세지를 쓰는 곳입니다.");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() { //항목을 클릭했을 때, 버튼의 문자열이 바뀜 / 항목이 클릭되었을때 처리되는 클래스를 익명클래스로 만듬
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]); //항목이 클릭되었을때 버튼의 설정이 바뀜
            }
        });
        dialog.setPositiveButton("OK", null); //null을 했으므로 버튼을 써도 아무 의미없음
        dialog.show(); //보이게 반드시 설정해야 함
    }
}
