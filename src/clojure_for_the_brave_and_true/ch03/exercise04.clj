(ns clojure-for-the-brave-and-true.ch03.exercise04)

(defn mapset
  [f col]
  (set (map f col)))

(mapset inc [1 1 2 2])



