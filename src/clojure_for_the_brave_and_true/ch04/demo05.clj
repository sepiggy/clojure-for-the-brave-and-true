;
; The collection abstraction
;
(ns clojure-for-the-brave-and-true.ch04.demo05)

(empty? [])

(empty? ["no!"])

(map identity {:sunlight-reaction "Glitter!"})

(into {} (map identity {:sunlight-reaction "Glitter!"}))

(map identity [:garlic :sesame-oil :fried-eggs])

(into [] (map identity [:garlic :sesame-oil :fried-eggs]))

(conj [0] [1])
(conj [0] 1)

(conj [0] 1 2 3 4)
(conj {:time "midnight"} [:place "ye olde cemetarium"])

(defn my-conj
  [target & additions]
  (into target additions))

(my-conj [0] 1 2 3)
