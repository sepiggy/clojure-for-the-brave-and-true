var node3 = {
    value: "last",
    next: null
};

var node2 = {
    value: "middle",
    next: node3
};

var node1 = {
    value: "first",
    next: node2
};

var first = function (node) {
    return node.value;
};

var rest = function (node) {
    return node.next;
};

var cons = function (newValue, node) {
    return {
        value: newValue,
        next: node
    };
};

console.log(first(node1));
console.log(first(rest(node1)));
console.log(first(rest(rest(node1))));

var node0 = cons("new first", node1);
console.log(first(node0));

console.log(first(rest(node0)));

var map = function (list, transform) {
    if (list === null) {
        return null;
    } else {
        return cons(transform(first(list)), map(rest(list), transform));
    }
};

console.log(first(
    map(node1, function (val) {
        return val + " mapped!"
    })
));
