(defproject gcs-pow "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.google.cloud/google-cloud-storage "0.11.0-beta"]]
  :main ^:skip-aot gcs-pow.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
