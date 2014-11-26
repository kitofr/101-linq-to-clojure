(ns linq-2-clojure.linq91
  (:require [linq-2-clojure.data :refer :all]))

(defn average [coll]
  (/ (reduce + coll) (count coll)))

(defn linq91 "https://code.msdn.microsoft.com/LINQ-Aggregate-Operators-c51b3869" []
  (let [products products-list]
    (for [g (group-by :category products)]
      {:Category (first g) 
       :AveragePrice (average (map :unit-price (second g)))
       })))
