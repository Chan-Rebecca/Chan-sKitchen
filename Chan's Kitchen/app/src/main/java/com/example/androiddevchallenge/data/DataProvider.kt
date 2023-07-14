/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Meal

object DataProvider {

    val meal =
        Meal(
            id = 1,
            title = "Burger",
            type = "Snack",
            ingredients = "Ingredients: - Beginner\n" +
                    "\n" +
                    "    1 pound (450g) ground beef (80% lean)\n" +
                    "    1 teaspoon salt\n" +
                    "    1/2 teaspoon black pepper\n" +
                    "    4 hamburger buns\n" +
                    "    4 slices of cheese (cheddar, American, or your choice)\n" +
                    "    Lettuce leaves\n" +
                    "    Tomato slices\n" +
                    "    Onion slices\n" +
                    "    Pickle slices\n" +
                    "    Ketchup, mustard, mayonnaise (optional)\n" +
                    "    Olive oil (for cooking)",
            description = "Ingredients:\n" +
                    "\n" +
                    "    1 pound (450g) ground beef (80% lean)\n" +
                    "    1 teaspoon salt\n" +
                    "    1/2 teaspoon black pepper\n" +
                    "    4 hamburger buns\n" +
                    "    4 slices of cheese (cheddar, American, or your choice)\n" +
                    "    Lettuce leaves\n" +
                    "    Tomato slices\n" +
                    "    Onion slices\n" +
                    "    Pickle slices\n" +
                    "    Ketchup, mustard, mayonnaise (optional)\n" +
                    "    Olive oil (for cooking)",
            mealImageId = R.drawable.burger
        )

    val mealList = listOf(
        meal,
        Meal(
            id = 2,
            title = "Mahamri",
            type = "Breakfast",
            ingredients = "Ingredients: - Advanced\n" +
                    "\n" +
                    "    1 pound (450g) ground beef (80% lean)\n" +
                    "    1 teaspoon salt\n" +
                    "    1/2 teaspoon black pepper\n" +
                    "    4 hamburger buns\n" +
                    "    4 slices of cheese (cheddar, American, or your choice)\n" +
                    "    Lettuce leaves\n" +
                    "    Tomato slices\n" +
                    "    Onion slices\n" +
                    "    Pickle slices\n" +
                    "    Ketchup, mustard, mayonnaise (optional)\n" +
                    "    Olive oil (for cooking)",
            description = "Ingredients:\n" +
                    "\n" +
                    "    1 pound (450g) ground beef (80% lean)\n" +
                    "    1 teaspoon salt\n" +
                    "    1/2 teaspoon black pepper\n" +
                    "    4 hamburger buns\n" +
                    "    4 slices of cheese (cheddar, American, or your choice)\n" +
                    "    Lettuce leaves\n" +
                    "    Tomato slices\n" +
                    "    Onion slices\n" +
                    "    Pickle slices\n" +
                    "    Ketchup, mustard, mayonnaise (optional)\n" +
                    "    Olive oil (for cooking)",
            mealImageId = R.drawable.mahamri
        ),
        Meal(
            id = 3,
            title = "Mashed Potatoes",
            type = "Lunch",
            ingredients = "Ingredients: - Beginner\n" +
                    "\n" +
                    "    2 pounds (about 900 grams) of potatoes (russet or Yukon Gold)\n" +
                    "    1/2 cup (120 ml) of milk\n" +
                    "    1/4 cup (57 grams) of unsalted butter\n" +
                    "    Salt, to taste\n" +
                    "    Pepper, to taste\n" +
                    "\n" +
                    "Optional toppings:\n" +
                    "\n" +
                    "    Chopped fresh herbs (parsley, chives, or dill)\n" +
                    "    Grated cheese (cheddar, Parmesan, or Gruyere)\n" +
                    "    Crumbled bacon bits\n" +
                    "    Sour cream",
            description = "Instructions:\n" +
                    "\n" +
                    "    Peel the potatoes and cut them into evenly sized chunks. Rinse them under cold water to remove excess starch.\n" +
                    "\n" +
                    "    Place the potato chunks in a large pot and cover them with cold water. Add a generous pinch of salt to the water.\n" +
                    "\n" +
                    "    Bring the water to a boil over high heat, then reduce the heat to medium-low and let the potatoes simmer until they are fork-tender (about 15-20 minutes).\n" +
                    "\n" +
                    "    While the potatoes are cooking, heat the milk and butter in a small saucepan over low heat until the butter melts. Keep warm.\n" +
                    "\n" +
                    "    Drain the cooked potatoes and return them to the pot. Place the pot back on the stove over low heat to evaporate any remaining moisture in the potatoes.\n" +
                    "\n" +
                    "    Using a potato masher or a fork, begin mashing the potatoes until they are broken down into a rough texture.\n" +
                    "\n" +
                    "    Gradually pour the warm milk and butter mixture into the pot while continuing to mash the potatoes. The hot liquid will help incorporate it evenly into the potatoes. Keep mashing until the desired consistency is reached.\n" +
                    "\n" +
                    "    Season the mashed potatoes with salt and pepper to taste. Give them a final stir.\n" +
                    "\n" +
                    "    Serve the mashed potatoes hot. You can garnish them with chopped fresh herbs, grated cheese, crumbled bacon bits, or a dollop of sour cream, if desired.\n" +
                    "\n" +
                    "Enjoy your homemade mashed potatoes!",
            mealImageId = R.drawable.mashedpotatoes
        ),
        Meal(
            id = 4,
            title = "Mini Cakes",
            type = "Snack",
            ingredients = "Ingredients: - Beginner\n" +
                    "\n" +
                    "    1 1/2 cups all-purpose flour\n" +
                    "    1 1/2 teaspoons baking powder\n" +
                    "    1/4 teaspoon salt\n" +
                    "    1/2 cup unsalted butter, softened\n" +
                    "    3/4 cup granulated sugar\n" +
                    "    2 large eggs\n" +
                    "    1 teaspoon vanilla extract\n" +
                    "    1/2 cup milk\n" +
                    "\n" +
                    "For the frosting:\n" +
                    "\n" +
                    "    1 1/2 cups powdered sugar\n" +
                    "    1/4 cup unsalted butter, softened\n" +
                    "    2 tablespoons milk\n" +
                    "    Food coloring (optional)\n" +
                    "    Sprinkles or other decorations (optional)",
            description = "Instructions:\n" +
                    "\n" +
                    "    Preheat your oven to 350°F (175°C). Grease and flour a mini cake pan or line it with cupcake liners.\n" +
                    "\n" +
                    "    In a medium-sized bowl, whisk together the flour, baking powder, and salt. Set aside.\n" +
                    "\n" +
                    "    In a separate large bowl, cream together the softened butter and granulated sugar until light and fluffy.\n" +
                    "\n" +
                    "    Beat in the eggs, one at a time, ensuring each is fully incorporated before adding the next. Stir in the vanilla extract.\n" +
                    "\n" +
                    "    Gradually add the flour mixture to the butter mixture, alternating with the milk. Begin and end with the flour mixture, mixing until just combined after each addition. Be careful not to overmix, as it can result in dense cakes.\n" +
                    "\n" +
                    "    Spoon the batter into the prepared mini cake pan, filling each cavity about two-thirds full. Smooth the tops with the back of a spoon.\n" +
                    "\n" +
                    "    Bake in the preheated oven for about 15-20 minutes or until a toothpick inserted into the center comes out clean.\n" +
                    "\n" +
                    "    Remove the mini cakes from the oven and allow them to cool in the pan for 5 minutes. Then transfer them to a wire rack to cool completely.\n" +
                    "\n" +
                    "    While the cakes are cooling, prepare the frosting. In a bowl, beat the softened butter until creamy. Gradually add the powdered sugar, mixing well after each addition.\n" +
                    "\n" +
                    "    Stir in the milk until the frosting reaches a smooth and spreadable consistency. If desired, add a few drops of food coloring to achieve the desired color.\n" +
                    "\n" +
                    "    Once the mini cakes are completely cooled, spread or pipe the frosting onto the cakes. Decorate with sprinkles or other decorations, if desired.\n" +
                    "\n" +
                    "    Serve and enjoy your delicious mini cakes!\n" +
                    "\n" +
                    "Note: This recipe is for a standard mini cake pan, which usually yields 12 mini cakes. Adjust the quantities and baking time if using a different pan size.\n",
            mealImageId = R.drawable.minicakes
        ),
        Meal(
            id = 5,
            title = "Pancakes",
            type = "Breakfast",
            ingredients = "Ingredients: - Intermediate\n" +
                    "\n" +
                    "    1 cup all-purpose flour\n" +
                    "    2 tablespoons sugar\n" +
                    "    2 teaspoons baking powder\n" +
                    "    1/2 teaspoon salt\n" +
                    "    1 cup milk\n" +
                    "    1 large egg\n" +
                    "    2 tablespoons unsalted butter, melted\n" +
                    "    Cooking spray or additional butter for greasing the pan\n" +
                    "\n" +
                    "Optional toppings:\n" +
                    "\n" +
                    "    Maple syrup\n" +
                    "    Fresh berries\n" +
                    "    Sliced bananas\n" +
                    "    Chocolate chips\n" +
                    "    Whipped cream",
            description = "Instructions:\n" +
                    "\n" +
                    "    In a large mixing bowl, whisk together the flour, sugar, baking powder, and salt until well combined.\n" +
                    "\n" +
                    "    In a separate bowl, beat the egg and then add the milk and melted butter. Whisk until the mixture is smooth.\n" +
                    "\n" +
                    "    Pour the wet ingredients into the bowl with the dry ingredients. Stir gently with a spatula or wooden spoon until just combined. It's okay if there are a few lumps remaining. Be careful not to overmix, as this can make the pancakes tough.\n" +
                    "\n" +
                    "    Preheat a non-stick frying pan or griddle over medium heat. If using a pan, you may need to grease it with cooking spray or a small amount of butter.\n" +
                    "\n" +
                    "    Once the pan is hot, pour about 1/4 cup of the batter onto the pan for each pancake. You can adjust the amount depending on how large you want your pancakes to be.\n" +
                    "\n" +
                    "    Cook the pancakes for 2-3 minutes, or until the edges start to look set and small bubbles form on the surface.\n" +
                    "\n" +
                    "    Flip the pancakes using a spatula, and cook for an additional 1-2 minutes on the other side, or until golden brown and cooked through.\n" +
                    "\n" +
                    "    Remove the pancakes from the pan and keep them warm. You can place them on a plate in a low-temperature oven (around 200°F or 95°C) while you cook the remaining batter.\n" +
                    "\n" +
                    "    Repeat the process with the remaining batter, adding more cooking spray or butter to the pan as needed.\n" +
                    "\n" +
                    "    Serve the pancakes warm with your favorite toppings, such as maple syrup, fresh berries, sliced bananas, chocolate chips, or whipped cream.\n" +
                    "\n" +
                    "Enjoy your homemade pancakes!",
            mealImageId = R.drawable.pancakes
        ),
        Meal(
            id = 6,
            title = "Pasta",
            type = "Dinner",
            ingredients = "Ingredients: - Beginner\n" +
                    "\n" +
                    "    8 ounces (225 grams) of pasta (spaghetti, penne, or your preferred type)\n" +
                    "    2 tablespoons olive oil\n" +
                    "    1 onion, finely chopped\n" +
                    "    2 cloves of garlic, minced\n" +
                    "    1 can (14 ounces/400 grams) of diced tomatoes\n" +
                    "    1 can (6 ounces/170 grams) of tomato paste\n" +
                    "    1 teaspoon dried oregano\n" +
                    "    1 teaspoon dried basil\n" +
                    "    1/2 teaspoon red pepper flakes (optional, for heat)\n" +
                    "    Salt and pepper to taste\n" +
                    "    Grated Parmesan cheese, for serving\n" +
                    "    Fresh basil leaves, for garnish (optional)",
            description = "Instructions:\n" +
                    "\n" +
                    "    Bring a large pot of salted water to a boil. Cook the pasta according to the package instructions until al dente (firm to the bite). Drain the pasta and set aside.\n" +
                    "\n" +
                    "    In a large saucepan, heat the olive oil over medium heat. Add the chopped onion and cook until it becomes translucent and slightly golden, stirring occasionally. This usually takes about 5 minutes.\n" +
                    "\n" +
                    "    Add the minced garlic to the pan and sauté for an additional minute until fragrant.\n" +
                    "\n" +
                    "    Pour in the diced tomatoes and tomato paste. Stir well to combine and break up any large chunks of tomatoes. Reduce the heat to low and let the sauce simmer for about 10 minutes to allow the flavors to meld together.\n" +
                    "\n" +
                    "    Add the dried oregano, dried basil, and red pepper flakes (if using) to the sauce. Season with salt and pepper to taste. Stir to incorporate the spices into the sauce.\n" +
                    "\n" +
                    "    Once the sauce has simmered and thickened slightly, add the cooked pasta to the pan. Toss the pasta in the sauce until it is evenly coated. Cook for an additional 1-2 minutes to allow the pasta to absorb some of the flavors.\n" +
                    "\n" +
                    "    Remove the pan from the heat. Serve the pasta in individual bowls or plates, garnished with grated Parmesan cheese and fresh basil leaves if desired.\n" +
                    "\n" +
                    "Enjoy your delicious homemade pasta!",
            mealImageId = R.drawable.pasta
        ),
        Meal(
            id = 7,
            title = "Waffles",
            type = "Breakfast",
            ingredients = "Ingredients: -Advanced\n" +
                    "\n" +
                    "    2 cups all-purpose flour\n" +
                    "    2 tablespoons granulated sugar\n" +
                    "    1 tablespoon baking powder\n" +
                    "    1/2 teaspoon salt\n" +
                    "    2 large eggs\n" +
                    "    1 3/4 cups milk\n" +
                    "    1/2 cup unsalted butter, melted\n" +
                    "    1 teaspoon vanilla extract",
            description = "Instructions:\n" +
                    "\n" +
                    "    Preheat your waffle iron according to the manufacturer's instructions.\n" +
                    "\n" +
                    "    In a large mixing bowl, whisk together the flour, sugar, baking powder, and salt until well combined.\n" +
                    "\n" +
                    "    In a separate bowl, beat the eggs. Add the milk, melted butter, and vanilla extract. Mix until everything is thoroughly combined.\n" +
                    "\n" +
                    "    Pour the wet ingredients into the bowl with the dry ingredients. Stir gently until just combined. Be careful not to overmix; a few lumps are fine.\n" +
                    "\n" +
                    "    Lightly grease the preheated waffle iron with cooking spray or a small amount of melted butter.\n" +
                    "\n" +
                    "    Ladle the batter onto the center of the waffle iron, using the amount recommended by the manufacturer (usually around 1/2 to 3/4 cup of batter, depending on the size of your waffle iron). Spread the batter slightly using the back of a ladle or a spatula.\n" +
                    "\n" +
                    "    Close the waffle iron and cook the waffles according to the manufacturer's instructions, usually for about 3-5 minutes or until golden brown and crisp.\n" +
                    "\n" +
                    "    Once cooked, carefully remove the waffle from the iron and place it on a wire rack to cool slightly. Avoid stacking the waffles on top of each other, as this can make them lose their crispness.\n" +
                    "\n" +
                    "    Repeat steps 6-8 with the remaining batter until all the waffles are cooked.\n" +
                    "\n" +
                    "    Serve the waffles warm with your favorite toppings such as maple syrup, fresh fruit, whipped cream, or a dusting of powdered sugar.\n" +
                    "\n" +
                    "Enjoy your homemade waffles!",
            mealImageId = R.drawable.waffles
        ),
        Meal(
            id = 8,
            title = "Vegetable Rice",
            type = "Lunch",
            ingredients = "Ingredients:- Intermediate\n" +
                    "\n" +
                    "    1 cup basmati rice\n" +
                    "    2 cups water\n" +
                    "    1 tablespoon vegetable oil\n" +
                    "    1 medium onion, diced\n" +
                    "    2 cloves garlic, minced\n" +
                    "    1 carrot, diced\n" +
                    "    1 bell pepper (any color), diced\n" +
                    "    1 cup green beans, trimmed and cut into 1-inch pieces\n" +
                    "    1 cup frozen peas\n" +
                    "    2 tablespoons soy sauce\n" +
                    "    1 tablespoon oyster sauce (optional)\n" +
                    "    1 teaspoon sesame oil\n" +
                    "    Salt and pepper to taste\n" +
                    "    Fresh cilantro or parsley for garnish (optional)",
            description = "Instructions:\n" +
                    "\n" +
                    "    Rinse the basmati rice under cold water until the water runs clear. This helps remove excess starch. Drain the rice and set it aside.\n" +
                    "    In a medium-sized pot, bring 2 cups of water to a boil. Add the rinsed rice to the boiling water and reduce the heat to low. Cover the pot with a tight-fitting lid and simmer for about 15-20 minutes or until the rice is tender and the water is absorbed.\n" +
                    "    While the rice is cooking, heat the vegetable oil in a large skillet or wok over medium heat.\n" +
                    "    Add the diced onion and minced garlic to the skillet and sauté for 2-3 minutes until they become translucent and fragrant.\n" +
                    "    Add the diced carrot, bell pepper, green beans, and frozen peas to the skillet. Stir-fry the vegetables for 5-7 minutes or until they are crisp-tender.\n" +
                    "    In a small bowl, whisk together the soy sauce, oyster sauce (if using), and sesame oil. Pour the sauce over the vegetables in the skillet and stir well to combine. Cook for an additional 2 minutes to allow the flavors to meld together.\n" +
                    "    Once the rice is cooked, add it to the skillet with the vegetables and sauce. Gently toss everything together until the rice is well coated and the vegetables are evenly distributed. Cook for another 2-3 minutes to heat the rice through.\n" +
                    "    Season with salt and pepper to taste. You can also adjust the seasonings by adding more soy sauce or oyster sauce if desired.\n" +
                    "    Remove the vegetable rice from the heat and garnish with fresh cilantro or parsley, if desired.\n" +
                    "    Serve the vegetable rice as a main dish or as a side dish with your favorite protein. Enjoy!\n" +
                    "\n" +
                    "Note: Feel free to customize this recipe by adding other vegetables like mushrooms, corn, or broccoli. You can also add cooked chicken, shrimp, or tofu for added protein.",
            mealImageId = R.drawable.vegierice
        ),
        Meal(
            id = 9,
            title = "Vegetable Salad",
            type = "Snack",
            ingredients = "Ingredients: Beginner\n" +
                    "\n" +
                    "    2 cups mixed salad greens (lettuce, spinach, arugula, etc.)\n" +
                    "    1 cucumber, sliced\n" +
                    "    1 bell pepper, diced\n" +
                    "    1 carrot, grated\n" +
                    "    1 small red onion, thinly sliced\n" +
                    "    1 cup cherry tomatoes, halved\n" +
                    "    1/2 cup sliced radishes\n" +
                    "    1/4 cup chopped fresh herbs (such as parsley, basil, or cilantro)\n" +
                    "    1/4 cup crumbled feta cheese (optional)\n" +
                    "    1/4 cup toasted nuts or seeds (such as almonds, walnuts, or sunflower seeds)\n" +
                    "\n" +
                    "For the dressing:\n" +
                    "\n" +
                    "    3 tablespoons extra-virgin olive oil\n" +
                    "    2 tablespoons lemon juice (or vinegar of your choice)\n" +
                    "    1 garlic clove, minced\n" +
                    "    1 teaspoon Dijon mustard\n" +
                    "    Salt and pepper to taste",
            description = "Instructions:\n" +
                    "\n" +
                    "    In a large salad bowl, combine the mixed salad greens, cucumber, bell pepper, carrot, red onion, cherry tomatoes, radishes, and fresh herbs.\n" +
                    "\n" +
                    "    In a separate small bowl, whisk together the olive oil, lemon juice (or vinegar), minced garlic, Dijon mustard, salt, and pepper until well combined.\n" +
                    "\n" +
                    "    Drizzle the dressing over the salad and toss gently to coat all the vegetables evenly.\n" +
                    "\n" +
                    "    Sprinkle crumbled feta cheese (if using) and toasted nuts or seeds over the top of the salad.\n" +
                    "\n" +
                    "    Serve immediately and enjoy!\n" +
                    "\n" +
                    "Feel free to customize this recipe by adding or substituting other vegetables and ingredients based on your preferences.\n",
            mealImageId = R.drawable.vegiesalad
        ),
        Meal(
            id = 10,
            title = "Pilau",
            type = "Dinner ",
            ingredients = "Ingredients: - Advanced\n" +
                    "\n" +
                    "    2 cups basmati rice\n" +
                    "    3 tablespoons vegetable oil\n" +
                    "    1 large onion, finely chopped\n" +
                    "    2 cloves of garlic, minced\n" +
                    "    1-inch piece of ginger, grated\n" +
                    "    2 tomatoes, diced\n" +
                    "    1 teaspoon cumin seeds\n" +
                    "    1 teaspoon coriander seeds\n" +
                    "    1 teaspoon turmeric powder\n" +
                    "    1/2 teaspoon ground cinnamon\n" +
                    "    1/2 teaspoon ground cardamom\n" +
                    "    1/4 teaspoon cayenne pepper (optional, for heat)\n" +
                    "    2 cups vegetable or chicken broth",
            description = "Instructions:\n" +
                    "\n" +
                    "    Rinse the basmati rice under cold water until the water runs clear. Soak the rice in water for 30 minutes, then drain.\n" +
                    "\n" +
                    "    Heat the vegetable oil in a large, deep skillet or pot over medium heat. Add the chopped onions and sauté until they turn golden brown, about 5-7 minutes.\n" +
                    "\n" +
                    "    Add the minced garlic and grated ginger to the skillet. Sauté for another 1-2 minutes until fragrant.\n" +
                    "\n" +
                    "    In a mortar and pestle or a spice grinder, grind the cumin seeds and coriander seeds into a fine powder. Add the ground spices, turmeric powder, ground cinnamon, ground cardamom, and cayenne pepper (if using) to the skillet. Stir well to combine the spices with the onion mixture.\n" +
                    "\n" +
                    "    Add the diced tomatoes to the skillet and cook for 2-3 minutes until they start to soften.\n" +
                    "\n" +
                    "    Add the drained basmati rice to the skillet and stir gently to coat the rice with the onion and tomato mixture.\n" +
                    "\n" +
                    "    Pour in the vegetable or chicken broth and water. Season with salt according to your taste. Bring the mixture to a boil, then reduce the heat to low. Cover the skillet with a tight-fitting lid and simmer for 15-20 minutes, or until the rice is cooked and the liquid has been absorbed. Avoid stirring the rice during this time to prevent it from becoming sticky.\n" +
                    "\n" +
                    "    Once the rice is cooked, remove the skillet from heat and let it sit, covered, for another 5 minutes to allow the flavors to meld and the rice to steam.\n" +
                    "\n" +
                    "    Fluff the rice gently with a fork before serving. Garnish with fresh cilantro or parsley, if desired.\n" +
                    "\n" +
                    "Your delicious pilau is now ready to be served! Enjoy it as a standalone dish or pair it with your favorite curry or yogurt raita.",
            mealImageId = R.drawable.pilau
        ),
    )
}
