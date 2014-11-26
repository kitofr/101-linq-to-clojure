(ns linq-2-clojure.linq40)

(def nums [5 4 1 3 9 8 6 7 2 0])

(defn linq40 []
  (doseq [x (group-by #(mod % 5) nums)]
    (println (str "Numbers with a remainder of " (key x) " when divided by 5:" ))
    (doseq [n (val x)]
      (println n))))

