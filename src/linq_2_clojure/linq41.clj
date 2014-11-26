(ns linq-2-clojure.linq41)

(def words [ "blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese" ])

(defn linq41 []
  (doseq [w (group-by first words)]
    (println (str "Words that start with the letter '" (key w) "':"))
    (doseq [word (val w)]
      (println word))))

