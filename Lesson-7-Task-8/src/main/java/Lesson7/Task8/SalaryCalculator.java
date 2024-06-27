package Lesson7.Task8;
import Lesson7.BaseSalary;
import Lesson7.SaturdaySalary;
import java.math.BigDecimal;
public class SalaryCalculator {
    private final BigDecimal bonusSalary;
    private final BaseSalary baseSalary;
    private final SaturdaySalary saturdaySalary;
        public SalaryCalculator(double bonusSalary, BaseSalary baseSalary, SaturdaySalary saturdaySalary) {
            this.bonusSalary = BigDecimal.valueOf(bonusSalary);
            this.baseSalary = baseSalary;
            this.saturdaySalary = saturdaySalary;
        }
        public BigDecimal getTotalEmployeeSalary(double bonusForOneDay, double numberOfSaturdays) {
            return this.bonusSalary.add(
                    baseSalary.getBaseSalary()).add(
                    saturdaySalary.getSaturdaySalary(bonusForOneDay, numberOfSaturdays));
        }
}
