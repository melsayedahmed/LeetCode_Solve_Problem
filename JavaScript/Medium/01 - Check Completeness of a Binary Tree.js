// Link in Leetcode
// https://leetcode.com/problems/check-completeness-of-a-binary-tree/


// (----------------------------- THE ANSWER -----------------------------)


/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isCompleteTree = function(root) {
    if (!root) {
        return true;
    }
    const queue = [root];
    let seenNull = false;
    while (queue.length > 0) {
        const curr = queue.shift();
        if (curr === null) {
            seenNull = true;
        } else {
            if (seenNull) {
                return false;
            }
            queue.push(curr.left);
            queue.push(curr.right);
        }
    }
    return true;
};
