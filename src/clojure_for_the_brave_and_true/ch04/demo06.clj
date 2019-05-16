;
; Function Functions
;
(ns clojure-for-the-brave-and-true.ch04.demo06)

(max 0 1 2)

(max [0 1 2])

(apply max [0 1 2])

(defn my-into
  [target additions]
  (apply conj target additions))

(my-into [0] [1 2 3])

(def add10 (partial + 10))
(add10 3)
(add10 5)

(def add-missing-elements
  (partial conj ["water" "earth" "air"]))
(add-missing-elements "unobtainium" "adamantium")

(defn my-partial
  [partialized-fn & args]
  (fn [& more-args]
    (apply partialized-fn (into args more-args))))

(def add20 (my-partial + 20))
(add20 3)