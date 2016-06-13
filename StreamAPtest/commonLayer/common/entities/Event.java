package common.entities;


import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Event {
    public final String type;
    public final User_interaction user_interaction;
    public final Time time;
    public final String event_id;
    public final Device device;
    public final String source;
    public final String format;
    public final String tenant_id;
    public final Application application;
    public final Consent consent;
    public final Network network;
    public final String timestamp;
    public final Sender_info sender_info;
    public final System system;

    @JsonCreator
    public Event(@JsonProperty("type") String type, @JsonProperty("user_interaction") User_interaction user_interaction, @JsonProperty("time") Time time, @JsonProperty("event_id") String event_id, @JsonProperty("device") Device device, @JsonProperty("source") String source, @JsonProperty("format") String format, @JsonProperty("tenant_id") String tenant_id, @JsonProperty("application") Application application, @JsonProperty("consent") Consent consent, @JsonProperty("network") Network network, @JsonProperty("timestamp") String timestamp, @JsonProperty("sender_info") Sender_info sender_info, @JsonProperty("system") System system){
        this.type = type;
        this.user_interaction = user_interaction;
        this.time = time;
        this.event_id = event_id;
        this.device = device;
        this.source = source;
        this.format = format;
        this.tenant_id = tenant_id;
        this.application = application;
        this.consent = consent;
        this.network = network;
        this.timestamp = timestamp;
        this.sender_info = sender_info;
        this.system = system;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class User_interaction {
        public final String type;
        public final String view_id;

        @JsonCreator
        public User_interaction(@JsonProperty("type") String type, @JsonProperty("view_id") String view_id){
            this.type = type;
            this.view_id = view_id;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Time {
        public final String create_timestamp;
        public final String send_timestamp;

        @JsonCreator
        public Time(@JsonProperty("create_timestamp") String create_timestamp, @JsonProperty("send_timestamp") String send_timestamp){
            this.create_timestamp = create_timestamp;
            this.send_timestamp = send_timestamp;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Device {
        public final Operating_system operating_system;
        public final String manufacturer;
        public final String model;
        public final Display_resolution display_resolution;
        public final String device_id;
        public final String language;
        public final String timezone;
        public final boolean rooted;

        @JsonCreator
        public Device(@JsonProperty("operating_system") Operating_system operating_system, @JsonProperty("manufacturer") String manufacturer, @JsonProperty("model") String model, @JsonProperty("display_resolution") Display_resolution display_resolution, @JsonProperty("device_id") String device_id, @JsonProperty("language") String language, @JsonProperty("timezone") String timezone, @JsonProperty("rooted") boolean rooted){
            this.operating_system = operating_system;
            this.manufacturer = manufacturer;
            this.model = model;
            this.display_resolution = display_resolution;
            this.device_id = device_id;
            this.language = language;
            this.timezone = timezone;
            this.rooted = rooted;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static final class Operating_system {
            public final String kind;
            public final String version;
            public final String name;
    
            @JsonCreator
            public Operating_system(@JsonProperty("kind") String kind, @JsonProperty("version") String version, @JsonProperty("name") String name){
                this.kind = kind;
                this.version = version;
                this.name = name;
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static final class Display_resolution {
            public final String width;
            public final String height;
    
            @JsonCreator
            public Display_resolution(@JsonProperty("width") String width, @JsonProperty("height") String height){
                this.width = width;
                this.height = height;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Application {
        public final String name;
        public final String version;
        public final String package_name;
        public final String language;

        @JsonCreator
        public Application(@JsonProperty("name") String name, @JsonProperty("version") String version, @JsonProperty("package_name") String package_name, @JsonProperty("language") String language){
            this.name = name;
            this.version = version;
            this.package_name = package_name;
            this.language = language;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Consent {
        public final boolean product_improvement;
        public final boolean tips;
        public final boolean offers;

        @JsonCreator
        public Consent(@JsonProperty("product_improvement") boolean product_improvement, @JsonProperty("tips") boolean tips, @JsonProperty("offers") boolean offers){
            this.product_improvement = product_improvement;
            this.tips = tips;
            this.offers = offers;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Network {
        public final String carrier;
        public final String connection;

        @JsonCreator
        public Network(@JsonProperty("carrier") String carrier, @JsonProperty("connection") String connection){
            this.carrier = carrier;
            this.connection = connection;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Sender_info {
        public final String agent;
        public final String received_timestamp;
        public final String ip;
        public final Device device;
        public final Geo geo;

        @JsonCreator
        public Sender_info(@JsonProperty("agent") String agent, @JsonProperty("received_timestamp") String received_timestamp, @JsonProperty("ip") String ip, @JsonProperty("device") Device device, @JsonProperty("geo") Geo geo){
            this.agent = agent;
            this.received_timestamp = received_timestamp;
            this.ip = ip;
            this.device = device;
            this.geo = geo;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static final class Device {
            public final String os;
            public final String phone;
            public final String tablet;
            public final String user_agent;
    
            @JsonCreator
            public Device(@JsonProperty("os") String os, @JsonProperty("phone") String phone, @JsonProperty("tablet") String tablet, @JsonProperty("user_agent") String user_agent){
                this.os = os;
                this.phone = phone;
                this.tablet = tablet;
                this.user_agent = user_agent;
            }
    
        
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static final class Geo {
            public final String[] range;
            public final String country;
            public final String region;
            public final String city;
            public final String[] ll;
            public final String metro;
    
            @JsonCreator
            public Geo(@JsonProperty("range") String[] range, @JsonProperty("country") String country, @JsonProperty("region") String region, @JsonProperty("city") String city, @JsonProperty("ll") String[] ll, @JsonProperty("metro") String metro){
                this.range = range;
                this.country = country;
                this.region = region;
                this.city = city;
                this.ll = ll;
                this.metro = metro;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class System {
        public final String deployment_name;

        @JsonCreator
        public System(@JsonProperty("deployment_name") String deployment_name){
            this.deployment_name = deployment_name;
        }
    }
}