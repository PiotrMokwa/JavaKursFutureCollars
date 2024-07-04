package Lesson7;
import java.math.BigDecimal;
public interface SaturdaySalary {
   default BigDecimal getSaturdaySalary(double bonusForOneDay, double numberOfSaturdays){
      BigDecimal convertedBonusForOneDay = BigDecimal.valueOf(bonusForOneDay);
      BigDecimal convertedNumberOfSaturdays = BigDecimal.valueOf(numberOfSaturdays);
      return convertedBonusForOneDay.multiply(convertedNumberOfSaturdays);
   }
}
