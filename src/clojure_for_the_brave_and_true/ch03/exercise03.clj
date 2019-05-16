(ns clojure-for-the-brave-and-true.ch03.exercise03)

(defn dec-maker
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

(dec9 10)
(dec9 100)
(dec9 1000)


