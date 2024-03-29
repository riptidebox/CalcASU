
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class FinishCalculatorAppTest {

    @Test
    void testValidInput_CalculateTotalCost() {
        // Создание обьекта ссылка на внешний класс
        FinishCalculatorApp app = new FinishCalculatorApp();
        FinishCalculatorApp.CalculateListener listener = app.new CalculateListener();

        app.areaInput.setText("10"); // Устанавливаем площадь в 10 кв. метров
        app.comboCeilingType.setSelectedItem("Гипсокартон"); // Выбираем тип потолка "Гипсокартон"
        app.comboWallWorkType.setSelectedItem("Обои"); // Выбираем вид работ со стенами "Обои"
        app.checkboxElectrical.setSelected(true); // Устанавливаем флажок "Электрика"
        app.checkboxPlumbing.setSelected(false); // Сбрасываем флажок "Сантехника"
        app.comboFloorType.setSelectedItem("Ламинат"); // Выбираем тип полов "Ламинат"

        ActionEvent event = new ActionEvent(app.calculateButton, ActionEvent.ACTION_PERFORMED, "");

        // Действие
        listener.actionPerformed(event);

        // Проверка
        assertEquals("Общая стоимость: 3125.0 руб.", app.labelOutput.getText());
    }