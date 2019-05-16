(ns clojure-for-the-brave-and-true.ch03.demo04)

(reduce + [1 2 3 4])
(reduce + 15 [1 2 3 4])

(defn my-reduce
  ([f initial coll]
   (loop [result initial
          remaining coll]
     (if (empty? remaining)
       result
       (recur (f result (first remaining)) (rest remaining))))))

([f [head & tail]])
(my-reduce f head tail)