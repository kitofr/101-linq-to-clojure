(ns linq-2-clojure.core-test
  (:require [clojure.test :refer :all]
            [linq-2-clojure.linq40 :refer :all]))

(deftest a-test
  (testing "linq40"
    (is (= (with-out-str (linq40) "foo")))))
