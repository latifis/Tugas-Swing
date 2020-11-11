package tugasswing;
import javax.swing.*;
import java.awt.*;


public class TugasSwing {
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

class GUI extends JFrame{
    JLabel lform = new JLabel("Formulir Pendaftaran");
    
    JLabel lnama = new JLabel("Masukkan Nama Lengkap :");
    final JTextField fnama = new JTextField(32);
    
    JLabel lnim = new JLabel("Masukkan NIM :");
    final JTextField fnim = new JTextField(9);
    
    JLabel lttl = new JLabel("Tempat, Tanggal Lahir");
    final JTextField ftempat = new JTextField(10);
    final JTextField ftgllhr = new JTextField(" DD/MM/YYYY");
    
    JLabel lkelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton ("laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmagama = new JComboBox(namaAgama);
    
    JLabel lalamat = new JLabel("Alamat :");
    final JTextField falamat = new JTextField(32);    
    
    JLabel ldepartemen = new JLabel("Masuk ke Departemen mana :");
    String[] namadepartemen = {"DEPARTEMEN REGENERASI DAN PENGEMBANGAN MAHASISWA", 
                                "DEPARTEMEN PENGABDIAN MASYARAKAT",
                                "DEPARTEMEN MINAT DAN BAKAT",
                                "DEPARTEMEN KEWIRAUSAHAAN",
                                "DEPARTEMEN KESEJAHTERAAN MAHASISWA",
                                "DEPARTEMEN AKADEMI DAN PROFESI",
                                "DEPARTEMEN MEDIA KOMUNIKASI DAN INFORMASI",
                                "DEPARTEMEN HUMAS DAN KESEKRETARIATAN"};
    JComboBox cmdepartemen = new JComboBox(namadepartemen);
    
    JLabel lmotivasi = new JLabel("Motivasi anda ingin menjadi pengurus hima :");
    JTextField fmotivasi = new JTextField(50);
    
    JLabel lpernyataan = new JLabel("Dengan ini saya menyetujui semua persyaratan yang ada");
    JRadioButton rbmenyetujui = new JRadioButton();
    
    JButton bsubmit = new JButton("Submit");
    JButton bcancel = new JButton("Cancel");
    
    public GUI(){
        setTitle("HIMASISFO");
        setSize(500,700);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lform);
        add(lnama);
        add(fnama);
        add(lnim);
        add(fnim);
        add(lttl);
        add(ftempat);
        add(ftgllhr);
        add(lkelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmagama);
        add(lalamat);
        add(falamat);
        add(ldepartemen);
        add(cmdepartemen);
        add(lmotivasi);
        add(fmotivasi);
        add(lpernyataan);
        add(rbmenyetujui);
        add(bsubmit);
        add(bcancel);
        
        //set Bounds
        lform.setBounds(200,10,120,10);
        lnama.setBounds(10,30,200,20);
        fnama.setBounds(10,50,400,20);
        lnim.setBounds(10,80,200,20);
        fnim.setBounds(10,100,400,20);
        lttl.setBounds(10,130,200,20);
        ftempat.setBounds(10,150,190,20);
        ftgllhr.setBounds(210,150,200,20);
        lkelamin.setBounds(10,180,200,20);
        rblaki.setBounds(10,200,100,20);
	rbperempuan.setBounds(110,200,100,20);
        lagama.setBounds(10,230,200,20);
        cmagama.setBounds(10,255,200,30);
        lalamat.setBounds(10,290,200,20);
        falamat.setBounds(10,310,400,50);
        ldepartemen.setBounds(10,370,200,20);
        cmdepartemen.setBounds(10,390,400,30);
        lmotivasi.setBounds(10,430,300,20);
        fmotivasi.setBounds(10,450,400,50);
        rbmenyetujui.setBounds(10,500,20,20);
        lpernyataan.setBounds(30,500,400,20);
        bcancel.setBounds(205,600,100,20);
        bsubmit.setBounds(310,600,100,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}


//edit
//edit lagi
//edit lagi lagi
