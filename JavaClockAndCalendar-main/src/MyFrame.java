import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame() throws InterruptedException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Relógio rsrsrs");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormat= new SimpleDateFormat("hh:mm:ss a");
        dayFormat= new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel= new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(255,140,0));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel= new JLabel();
        dayLabel.setFont(new Font("Verdana",Font.PLAIN,35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));



        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTime();

    }

    public void setTime() throws InterruptedException {
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            Thread.sleep(1000);
        }
    }


}
