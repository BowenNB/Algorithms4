//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组

package leetcode.editor.cn;

import tools.PrintUtil;

public class PlusOne {

  public static void main(String[] args) {
    Solution solution = new PlusOne().new Solution();
    int[] a = {9, 9, 9};
    int[] ret = solution.plusOne(a);
    PrintUtil.show(ret);
  }


  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public int[] plusOne(int[] a) {
      for (int i = a.length - 1; i >= 0; i--)
        if (((a[i] + 1) % 10) != 0) return a;
      a = new int[a.length + 1];
      a[0] = 1;
      return a;
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}