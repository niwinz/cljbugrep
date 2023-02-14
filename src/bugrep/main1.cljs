(ns bugrep.main1
  (:require [cljs.nodejs :as nodejs]))

(defprotocol IState1
  (-extract1 [_] [_ _] "Extract the current state value."))

(defprotocol IState2
  (-extract2 [it] [it it] "Extract the current state value."))

(extend-type default
  IState1
  (-extract1
    ([_] nil)
    ([_ default] default)))

(nodejs/enable-util-print!)

(defn -main
  [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)
