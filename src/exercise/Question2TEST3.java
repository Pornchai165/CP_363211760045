package exercise;

import javax.swing.*;

public class Question2TEST3 {
    public static void main(String[] args) {

        String user_input ;
        String msg ;
        int choice=0;
        double  A,B,C,D,E,F,G,H,I;
        do{

            msg = "การคำนวณพลังงานที่จำเป็นพื้นฐานในการมีชีวิต  BMR ( Basal Metabolic Rate ) และ  พลังงานที่คุณใช้ในแต่ละวัน  TDEE ( Total Daily Energy Expenditure ) \n"+
                    "         คุณเพศอะไร\n"+
                    "1  เพศชาย\n"+
                    "2  เพศหญิง";

            user_input = JOptionPane.showInputDialog(msg);
            choice =Integer.parseInt(user_input);

            switch(choice)
            {

                case 1:
                    user_input = JOptionPane.showInputDialog("คุณอายุเท่าไหร่ ?");
                    A = Double.parseDouble(user_input);
                    user_input = JOptionPane.showInputDialog("คุณน้ำหนักเท่าไหร่ ?");
                    B = Double.parseDouble(user_input);
                    user_input = JOptionPane.showInputDialog("คุณสูงเท่าไหร่ ?");
                    C = Double.parseDouble(user_input);
                    D =66 + (13.7 * B) + (5 * C) - (6.8 * A) ;


                    msg = "คุณออกกำลังกายบ่อยแค่ไหน\n"+
                            "1  ออกกำลังกายมาก ( เป็นนักกีฬา )\n"+
                            "2  ออกกำลังกายหนัก ( 6-7 วัน / สัปดาห์ )\n"+
                            "3  ออกกำลังกายปานกลาง ( 3-5 วัน / สัปดาห์ )\n"+
                            "4  ออกกำลังกายน้อย ( 1-3 วัน / สัปดาห์ )\n"+
                            "5  ไม่ออกกำลังกาย ( หรือออกกำลังกายน้อยมาก )\n" ;


                    user_input = JOptionPane.showInputDialog(msg);
                    choice =Integer.parseInt(user_input);
                    switch(choice)
                    {
                        case 01:
                            E = D*1.9 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ E +" กิโลแคลอรี่" );
                            break;

                        case 02:
                            F = D*1.725 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ F +" กิโลแคลอรี่" );
                            break;

                        case 03:
                            G = D*1.55 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ G +" กิโลแคลอรี่" );
                            break;

                        case 04:
                            H = D*1.375 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+"= "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ H +" กิโลแคลอรี่" );
                            break;

                        case 05:
                            I = D*1.2 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ I +" กิโลแคลอรี่" );
                            break;

                        default :
                            JOptionPane.showMessageDialog(null, " คุณใส่ไม่ถูกต้อง ");
                    }

                case 2 :
                    user_input = JOptionPane.showInputDialog("คุณอายุเท่าไหร่ ?");
                    A = Double.parseDouble(user_input);
                    user_input = JOptionPane.showInputDialog("คุณน้ำหนักเท่าไหร่ ?");
                    B = Double.parseDouble(user_input);
                    user_input = JOptionPane.showInputDialog("คุณสูงเท่าไหร่ ?");
                    C = Double.parseDouble(user_input);
                    D =665 + (9.6 * B) + (1.8 * C) - (4.7 * A) ;


                    msg = "คุณออกกำลังกายบ่อยแค่ไหน\n"+
                            "1  ออกกำลังกายมาก ( เป็นนักกีฬา )\n"+
                            "2  ออกกำลังกายหนัก ( 6-7 วัน / สัปดาห์ )\n"+
                            "3  ออกกำลังกายปานกลาง ( 3-5 วัน / สัปดาห์ )\n"+
                            "4  ออกกำลังกายน้อย ( 1-3 วัน / สัปดาห์ )\n"+
                            "5  ไม่ออกกำลังกาย ( หรือออกกำลังกายน้อยมาก )\n" ;


                    user_input = JOptionPane.showInputDialog(msg);
                    choice =Integer.parseInt(user_input);
                    switch(choice)
                    {

                        case 1:
                            E = D*1.9 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ E +" กิโลแคลอรี่" );
                            break;

                        case 2:
                            F = D*1.725 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ F +" กิโลแคลอรี่" );
                            break;

                        case 3:
                            G = D*1.55 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ G +" กิโลแคลอรี่" );
                            break;

                        case 4:
                            H = D*1.375 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ H +" กิโลแคลอรี่" );
                            break;

                        case 5:
                            I = D*1.2 ;
                            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ I +" กิโลแคลอรี่" );
                            break;


                        default :
                            JOptionPane.showMessageDialog(null, " คุณใส่ไม่ถูกต้อง ");


                    }
                default :
                    JOptionPane.showMessageDialog(null, " คุณใส่ไม่ถูกต้อง ");

            }
        }

        while(true);





    }
}
