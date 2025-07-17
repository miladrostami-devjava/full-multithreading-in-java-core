package com.thread.p1_createThread;

import javax.swing.*;
import java.util.Objects;

public class TestClass extends Thread{


    private void apply_ButtonActionperform_threshold() {

        /*
           new Thread(() -> {
            try {
                String ip = ip_TextField.getText().trim();
                Map<OID, String> oidValueMap = new HashMap<>();

                if (!Objects.equals(inputPowerLowValue_Old, inputPowerLow_TextField.getText())) {
                    if (ValidationUtil.isValidRange(inputPowerLow_TextField, -28, 32)) {
                        oidValueMap.put(Constants.OID_INPUT_POWER_LOW, inputPowerLow_TextField.getText().trim());
                    } else {
                        JOptionPane.showMessageDialog(null, "Input power low is not valid.\nThe entered value must be between " + -28 + " and " + 32 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                }
                if (!Objects.equals(inputPowerHighValue_Old, inputPowerHigh_TextField.getText())) {
                    if (ValidationUtil.isValidRange(inputPowerHigh_TextField, 4, 8)) {
                        oidValueMap.put(Constants.OID_INPUT_POWER_HIGH, inputPowerHigh_TextField.getText().trim());
                    } else {
                        JOptionPane.showMessageDialog(null, "Input power high is not valid.\nThe entered value must be between " + 4 + " and " + 8 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                if (!Objects.equals(outputPowerLowValue_Old, outputPowerLow_TextField.getText())) {
                    if (ValidationUtil.isValidRange(outputPowerLow_TextField, 8, 12)) {
                        oidValueMap.put(Constants.OID_OUTPUT_POWER_LOW, outputPowerLow_TextField.getText().trim());
                    } else {
                        JOptionPane.showMessageDialog(null, "Output power low is not valid.\nThe entered value must be between " + 8 + " and " + 12 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                if (!Objects.equals(outputPowerHighValue_Old, outputPowerHigh_TextField.getText())) {
                    if (ValidationUtil.isValidRange(outputPowerHigh_TextField, 20, 24)) {
                        oidValueMap.put(Constants.OID_OUTPUT_POWER_HIGH, outputPowerHigh_TextField.getText().trim());
                    } else {
                        JOptionPane.showMessageDialog(null, "Output power high is not valid.\nThe entered value must be between " + 20 + " and " + 24 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                if (!Objects.equals(temperatueHighAlarmValue_Old, temperatureHighAlarm_TextField.getText())) {
                    if (ValidationUtil.isValidRange(temperatureHighAlarm_TextField, -28, 32)) {
                        oidValueMap.put(Constants.OID_TEMP_HIGH_ALARM, temperatureHighAlarm_TextField.getText().trim());
                    } else {
                        JOptionPane.showMessageDialog(null, "Temperature high alarm is not valid.\nThe entered value must be between " + -28 + " and " + 32 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                if (oidValueMap.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Not any changed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                FetchSnmpDataCommon.setSnmpData(ip, oidValueMap, true);
                JOptionPane.showMessageDialog(null, "SNMP SET successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error:review " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }).start();
        * */

 /*       try {
            String ip = ip_TextField.getText().trim();
            Map<OID, String> oidValueMap = new HashMap<>();

            if (!Objects.equals(inputPowerLowValue_Old, inputPowerLow_TextField.getText())) {
                if (ValidationUtil.isValidRange(inputPowerLow_TextField, -28, 32)) {
                    oidValueMap.put(Constants.OID_INPUT_POWER_LOW, inputPowerLow_TextField.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Input power low is not valid.\nThe entered value must be between " + -28 + " and " + 32 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
            if (!Objects.equals(inputPowerHighValue_Old, inputPowerHigh_TextField.getText())) {
                if (ValidationUtil.isValidRange(inputPowerHigh_TextField, 4, 8)) {
                    oidValueMap.put(Constants.OID_INPUT_POWER_HIGH, inputPowerHigh_TextField.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Input power high is not valid.\nThe entered value must be between " + 4 + " and " + 8 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (!Objects.equals(outputPowerLowValue_Old, outputPowerLow_TextField.getText())) {
                if (ValidationUtil.isValidRange(outputPowerLow_TextField, 8, 12)) {
                    oidValueMap.put(Constants.OID_OUTPUT_POWER_LOW, outputPowerLow_TextField.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Output power low is not valid.\nThe entered value must be between " + 8 + " and " + 12 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (!Objects.equals(outputPowerHighValue_Old, outputPowerHigh_TextField.getText())) {
                if (ValidationUtil.isValidRange(outputPowerHigh_TextField, 20, 24)) {
                    oidValueMap.put(Constants.OID_OUTPUT_POWER_HIGH, outputPowerHigh_TextField.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Output power high is not valid.\nThe entered value must be between " + 20 + " and " + 24 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (!Objects.equals(temperatueHighAlarmValue_Old, temperatureHighAlarm_TextField.getText())) {
                if (ValidationUtil.isValidRange(temperatureHighAlarm_TextField, -28, 32)) {
                    oidValueMap.put(Constants.OID_TEMP_HIGH_ALARM, temperatureHighAlarm_TextField.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Temperature high alarm is not valid.\nThe entered value must be between " + -28 + " and " + 32 + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (oidValueMap.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Not any changed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            FetchSnmpDataCommon.setSnmpData(ip, oidValueMap, true);
            JOptionPane.showMessageDialog(null, "SNMP SET successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error:review " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }


    @Override
    public void run() {
     apply_ButtonActionperform_threshold();
    }


    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.start();
    }
}
