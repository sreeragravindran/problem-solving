package problemsolving.recursion.possibleIPs;

import java.util.ArrayList;
import java.util.List;

/*
Given a string of digits, generate all possible valid IP address combinations.
IP addresses must follow the format A.B.C.D, where A, B, C, and D are numbers between 0 and 255. Zero-prefixed numbers, such as 01 and 065, are not allowed, except for 0 itself.
For example, given "2542540123", you should return ['254.25.40.123', '254.254.0.123'].
 */
public class GeneratePossibleIPs {

    public List<String> generate(String input) {
        List<String> ipList = new ArrayList();
        if(input.length() < 4 || input.length() > 12) {
            return ipList;
        }
        explorePaths(input, new ArrayList(), ipList);
        return ipList;
    }

    private void explorePaths(String input, List<String> ipParts, List<String> validIpList) {
        if(ipParts.size() == 4  && input.length() == 0) {
            // valid Ip
            validIpList.add(String.join(".", ipParts));
            return;
        }
        if(input.length() > (4 - ipParts.size()) * 3) {
            ipParts.remove(ipParts.size() - 1);
            return;
        }
        // possible path
        char c = input.charAt(0);
        if(c == '0') {
            ipParts.add(String.valueOf(c));
            explorePaths(input.substring(1), ipParts, validIpList);
            ipParts.remove(String.valueOf(c));
        } else {
            for(int i=1; i<=3; i++) {
                if(input.length() >= i) {
                    String ipPart = input.substring(0, i);
                    if (Integer.parseInt(ipPart) < 255 ) {
                        ipParts.add(ipPart);
                        explorePaths(input.substring(i), ipParts, validIpList);
                        ipParts.remove(ipPart);
                    }
                }
            }
        }

    }
}
