// Link in Leetcode
// https://leetcode.com/problems/binary-tree-preorder-traversal/


// (----------------------------- THE ANSWER -----------------------------)


function preorderTraversal(root) {
    let result = [];
    let stack = [root];
    while (stack.length > 0) {
        let node = stack.pop();
        if (node) {
            result.push(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }
    }
    return result;
}
