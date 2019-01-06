
package br.com.healthylife.util;


public class ValidateCpf {

    public boolean validateCPF(String strCpf) {
        int d1, d2;
        int digit1, digit2, rest;
        int digitCPF;
        String digitResult;

        d1 = d2 = 0;
        digit1 = digit2 = rest = 0;

        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount));

            d1 = d1 + (11 - nCount) * digitCPF;

            d2 = d2 + (12 - nCount) * digitCPF;
        }

        rest = (d1 % 11);

        if (rest < 2) {
            digit1 = 0;
        } else {
            digit1 = 11 - rest;
        }

        d2 += 2 * digit1;

        rest = (d2 % 11);

        if (rest < 2) {
            digit2 = 0;
        } else {
            digit2 = 11 - rest;
        }

        String digitValidate = strCpf.substring(strCpf.length() - 2, strCpf.length());

        digitResult = String.valueOf(digit1) + String.valueOf(digit2);

        return digitValidate.equals(digitResult);
    }
}
