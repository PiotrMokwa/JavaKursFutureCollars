package Lesson7;
import java.math.BigDecimal;
public  interface BaseSalary {
    default BigDecimal getBaseSalary() {
         return BigDecimal.valueOf(1000);
    }
}
