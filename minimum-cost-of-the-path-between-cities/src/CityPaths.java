import java.util.*;

public class CityPaths {

    // Class for representing a city's neighbor
    static class Neighbor {
        int index;
        int cost;

        public Neighbor(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
    }

    // Method to check the city name
    public static boolean isValidCityName(String cityName) {
        // Check that the city name consists only of characters a-z and has a length of no more than 10
        return cityName.matches("[a-z]{1,10}");
    }

    // Method to find the minimum cost path using Dijkstra's algorithm
    public static int findMinCost(List<List<Neighbor>> graph, int start, int end) {
        // Initialize the array to store the minimum cost to each city
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE); // Fill the array with infinity
        dist[start] = 0; // Starting city's cost is 0

        // Use a priority queue to find the minimum cost
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> dist[i]));
        pq.add(start);

        while (!pq.isEmpty()) {
            int current = pq.poll();

            // If we reached the target city, return its cost
            if (current == end) {
                return dist[end];
            }

            // Iterate over the city's neighbors
            for (Neighbor neighbor : graph.get(current)) {
                int newDist = dist[current] + neighbor.cost;
                if (newDist < dist[neighbor.index]) {
                    dist[neighbor.index] = newDist;
                    pq.add(neighbor.index); // Add the neighbor to the queue
                }
            }
        }

        return -1; // If no path is found, return -1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int t = 0; t < testCases; t++) {
            // Read the number of cities
            int n = Integer.parseInt(scanner.nextLine());

            // Map to associate the city name with its index
            Map<String, Integer> cityIndexMap = new HashMap<>();
            // Graph: adjacency list
            List<List<Neighbor>> graph = new ArrayList<>();

            // Initialize the graph
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            // Read the information for each city
            for (int i = 0; i < n; i++) {
                String cityName = scanner.nextLine();

                // Check if the city name is valid
                if (!isValidCityName(cityName)) {
                    throw new IllegalArgumentException("Invalid city name: " + cityName);
                }

                cityIndexMap.put(cityName, i); // Save the city's index

                int neighbors = Integer.parseInt(scanner.nextLine()); // number of neighbors
                for (int j = 0; j < neighbors; j++) {
                    String[] neighborData = scanner.nextLine().split(" ");
                    int neighborIndex = Integer.parseInt(neighborData[0]) - 1; // Convert to index
                    int cost = Integer.parseInt(neighborData[1]);

                    // Add the edge to the graph
                    graph.get(i).add(new Neighbor(neighborIndex, cost));
                }
            }

            // Read the number of city pairs for path queries
            int queries = Integer.parseInt(scanner.nextLine());
            for (int q = 0; q < queries; q++) {
                String[] query = scanner.nextLine().split(" ");
                String city1 = query[0]; // start city
                String city2 = query[1]; // target city

                // Get the indices of the cities
                int start = cityIndexMap.get(city1);
                int end = cityIndexMap.get(city2);

                // Calculate the minimum cost
                int minCost = findMinCost(graph, start, end);

                // Output the result if the cost is less than or equal to 200000
                if (minCost <= 200000 && minCost != -1) {
                    System.out.println(minCost);
                } else {
                    // If the cost exceeds 200000 or no path is found, output the message
                    System.out.println("No valid path or cost exceeds 200000");
                }
            }

            // Empty line between test cases
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
