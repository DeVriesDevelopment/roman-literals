import java.util.LinkedHashMap;
import java.util.Map;

class Converter {

  int remainder = 0;

  String convert(int number){
    remainder = number;
    String result = "";

    while(remainder > 0){
      if(remainder >= 10) {
        result += "X";
        remainder -= 10;
        continue;
      } else if(remainder == 9) {
        result += "IX";
        remainder -= 9;
        continue;
      }

      if(remainder >= 5) {
        result += "V";
        remainder -= 5;
        continue;
      } else if(remainder == 4){
        result += "IV";
        remainder -= 4;
        continue;
      }
      if(remainder >= 1) {
        result += "I";
        remainder -= 1;
      } else if (remainder == 0) {
        result += "";
        remainder -= 0;
      }
    }
    return result;
  }

  private String calculateNumeral(int highValue, int lowValue, String highNumeral, String lowNumeral) {
    String result = "";
    while (remainder >= highValue) {
      result += highNumeral;
      remainder -= highValue;
    }

    if(remainder == highValue - lowValue) {
      result += lowNumeral + highNumeral;
      remainder -= highValue - lowValue;
    }

    return result;
  }
}
