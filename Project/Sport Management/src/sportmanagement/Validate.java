/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportmanagement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Leandre
 */
public class Validate {
    public static boolean validateEmail(String email)
    {
        boolean status=false;
String EMAIL_PATTERN=
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
Pattern pattern = Pattern.compile(EMAIL_PATTERN);
Matcher matcher =pattern.matcher(email);
if(matcher.matches())
     status=true;
else
    status=false;

return status;
    }
    
}
